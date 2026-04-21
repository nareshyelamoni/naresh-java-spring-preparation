package com.naresh.timeapi;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneDemo {
    public static void main(String[] args) {
        GregorianCalendar g=new GregorianCalendar();
        System.out.println(g.isLeapYear(2026));
        System.out.println(g.getTimeZone());
        g.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta"));
        System.out.println(g.get(Calendar.DAY_OF_MONTH));
        System.out.println(g.getTime());
    }
}
