package com.naresh.timeapi;

import java.time.*;

public class ZoneDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime z=ZonedDateTime.now();
        System.out.println(z);
        ZoneId s=ZoneId.systemDefault();
        System.out.println(s);
        OffsetDateTime osdf=OffsetDateTime.now();
        System.out.println(osdf);
        OffsetTime ost=OffsetTime.now();
        System.out.println(ost);
        MonthDay md=MonthDay.now();
        System.out.println(md);
        Year y=Year.now();
        System.out.println(y);
        Period p=Period.of(2,2,29);
        System.out.println(p.addTo(LocalDateTime.now()));
        Instant i=Instant.now();
        System.out.println(i);
    }
}
