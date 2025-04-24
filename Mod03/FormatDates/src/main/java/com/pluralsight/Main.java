package com.pluralsight;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {


        LocalDateTime todaysDateTime = LocalDateTime.now();

        DateTimeFormatter formatWithSlashesMDY = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String slashMDY = todaysDateTime.format(formatWithSlashesMDY);
        System.out.println(slashMDY);

        DateTimeFormatter formatWithDashesYMD = DateTimeFormatter.ISO_DATE;
        String dashYMD = todaysDateTime.format(formatWithDashesYMD);
        System.out.println(dashYMD);


        DateTimeFormatter formatFullMonthDayYear = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String fullMonthDayYear = todaysDateTime.format(formatFullMonthDayYear);
        System.out.println(fullMonthDayYear);

        DateTimeFormatter formatDayMonthYearTime = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");
        String dayMonthYearTimeFormat = todaysDateTime.format(formatDayMonthYearTime);
        System.out.println(dayMonthYearTimeFormat);


        LocalDateTime GMT = LocalDateTime.now(ZoneId.of("GMT"));
        DateTimeFormatter formatGMT = DateTimeFormatter.ofPattern("HH:mm dd-MMM-yyyy");
        String formattedGMT = GMT.format(formatGMT);
        System.out.println(formattedGMT);


    }
}