package com.unique.simplealarmclock.util;

import org.junit.Test;
import java.util.Calendar;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DayUtilTest {
    private Calendar fixedNow() {
        Calendar now = Calendar.getInstance();
        now.set(2024, Calendar.JANUARY, 15, 10, 30, 45);
        now.set(Calendar.MILLISECOND, 123);
        return now;
    }

    @Test public void futureTimeTodayIsToday() {
        assertEquals("Today", DayUtil.getDay(11, 0, fixedNow()));
    }

    @Test public void earlierTimeIsTomorrow() {
        assertEquals("Tomorrow", DayUtil.getDay(10, 0, fixedNow()));
    }

    @Test public void exactMinuteIsTomorrow() {
        assertEquals("Tomorrow", DayUtil.getDay(10, 30, fixedNow()));
    }

    @Test public void suppliedCalendarIsNotMutated() {
        Calendar now = fixedNow();
        long before = now.getTimeInMillis();
        DayUtil.getDay(11, 0, now);
        assertTrue(before == now.getTimeInMillis());
    }
}
