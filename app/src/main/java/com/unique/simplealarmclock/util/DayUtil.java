package com.unique.simplealarmclock.util;

import java.util.Calendar;

public final class DayUtil {
    private DayUtil() { }

    public static String toDay(int day) throws Exception {
        switch (day) {
            case Calendar.SUNDAY: return "Sunday";
            case Calendar.MONDAY: return "Monday";
            case Calendar.TUESDAY: return "Tuesday";
            case Calendar.WEDNESDAY: return "Wednesday";
            case Calendar.THURSDAY: return "Thursday";
            case Calendar.FRIDAY: return "Friday";
            case Calendar.SATURDAY: return "Saturday";
            default: throw new Exception("Could not locate day");
        }
    }

    public static String getDay(int hour, int minute) {
        return getDay(hour, minute, Calendar.getInstance());
    }

    /** Computes the label against the supplied current time, enabling deterministic tests. */
    public static String getDay(int hour, int minute, Calendar now) {
        Calendar target = (Calendar) now.clone();
        target.set(Calendar.HOUR_OF_DAY, hour);
        target.set(Calendar.MINUTE, minute);
        target.set(Calendar.SECOND, 0);
        target.set(Calendar.MILLISECOND, 0);
        return target.getTimeInMillis() <= now.getTimeInMillis() ? "Tomorrow" : "Today";
    }
}
