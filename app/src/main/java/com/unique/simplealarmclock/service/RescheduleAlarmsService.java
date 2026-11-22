package com.unique.simplealarmclock.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleService;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

import com.unique.simplealarmclock.R;
import com.unique.simplealarmclock.model.Alarm;
import com.unique.simplealarmclock.data.AlarmRepository;

import java.util.List;

public class RescheduleAlarmsService extends LifecycleService {
    private static final int NOTIFICATION_ID = 2;
    private static final String CHANNEL_ID = "ALARM_RESCHEDULE_CHANNEL";

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);

        // This service is launched with startForegroundService() after boot.
        // Android requires foreground promotion before doing asynchronous work.
        startForeground(NOTIFICATION_ID, buildForegroundNotification());

        AlarmRepository alarmRepository = new AlarmRepository(getApplication());
        LiveData<List<Alarm>> alarmsLiveData = alarmRepository.getAlarmsLiveData();

        alarmsLiveData.observe(this, new Observer<List<Alarm>>() {
            @Override
            public void onChanged(List<Alarm> alarms) {
                alarmsLiveData.removeObserver(this);

                if (alarms != null) {
                    for (Alarm alarm : alarms) {
                        if (alarm != null && alarm.isStarted()) {
                            alarm.schedule(getApplicationContext());
                        }
                    }
                }

                // Boot recovery is a one-shot operation; do not leave a service
                // and its notification running after the database snapshot arrives.
                stopForeground(true);
                stopSelf(startId);
            }
        });

        return START_STICKY;
    }

    private Notification buildForegroundNotification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationManager manager = getSystemService(NotificationManager.class);
            if (manager != null && manager.getNotificationChannel(CHANNEL_ID) == null) {
                NotificationChannel channel = new NotificationChannel(
                        CHANNEL_ID,
                        getString(R.string.app_name) + " alarm recovery",
                        NotificationManager.IMPORTANCE_LOW
                );
                channel.setDescription("Temporarily restores scheduled alarms after device restart");
                manager.createNotificationChannel(channel);
            }
        }

        return new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_alarm_white_24dp)
                .setContentTitle(getString(R.string.app_name))
                .setContentText("Restoring scheduled alarms")
                .setCategory(NotificationCompat.CATEGORY_SERVICE)
                .setPriority(NotificationCompat.PRIORITY_LOW)
                .setOnlyAlertOnce(true)
                .setOngoing(true)
                .setSound(null)
                .build();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        super.onBind(intent);
        return null;
    }
}
