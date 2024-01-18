package edu.wgu.d387_sample_code.rest;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeConversion {

    public String convertTime() {
        // Eastern
        ZonedDateTime etTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

        // Mountain
        ZonedDateTime mtTime = etTime.withZoneSameInstant(ZoneId.of("America/Denver"));

        // Universal
        ZonedDateTime utcTime = etTime.withZoneSameInstant(ZoneId.of("UTC"));

        // display hours and minutes only
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        String etFormattedTime = etTime.format(formatter);
        String mtFormattedTime = mtTime.format(formatter);
        String utcFormattedTime = utcTime.format(formatter);

        // Return time
        return "ET: " + etFormattedTime + ", MT: " + mtFormattedTime + ", UTC: " + utcFormattedTime;
    }
}