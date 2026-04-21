package com.naresh.timeapi;

import java.time.*;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);
        LocalDate d1=d.plusWeeks(4L);
        System.out.println(d1);
        LocalDate d3=LocalDate.now(Clock.systemDefaultZone());
        System.out.println(d3);
        LocalDate d4=LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(d4);
        LocalDate d5=LocalDate.of(2000,11,27);
        System.out.println(d5);
        LocalDate d6=LocalDate.parse("2006-12-12");
        System.out.println(d6);
        LocalDate f=LocalDate.ofEpochDay(31);// 31 add to 1 jan 1970
        System.out.println(f);
        System.out.println("***************************************");
        LocalTime lt=LocalTime.now();
        System.out.println(lt);
        LocalTime lt1=LocalTime.of(14,15,37);
        System.out.println(lt1);
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
    }
}
