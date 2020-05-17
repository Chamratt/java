package com.chamratt.oop;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDateExample {
    private static final String DATE_FORMAT = "dd-M-yyyy hh:mm:ss a";
    public static void main(String[] args) {
        String dateTimeInString = "07-5-2020 04:46:00 PM";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeInString, DateTimeFormatter.ofPattern(DATE_FORMAT));
        ZoneId singaporeZoneId = ZoneId.of("Asia/Singapore");
        System.out.println("TimeZone " + singaporeZoneId);

        ZonedDateTime asiaZoneDateTime = localDateTime.atZone(singaporeZoneId);
        System.out.println("Date (Singapore) : "+asiaZoneDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        System.out.println("Date (Singapore) : "+formatter.format(asiaZoneDateTime));

    }
}
