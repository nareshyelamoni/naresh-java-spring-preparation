package com.naresh.timeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateTimeFormatDemo {
    public static void main(String[] args) {
        ZonedDateTime z=ZonedDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        System.out.println(df.format(z));
        System.out.println(z.get(ChronoField.DAY_OF_MONTH));
        LocalDate d= LocalDate.now();
        System.out.println(d.get(ChronoField.DAY_OF_YEAR));
    }
}
