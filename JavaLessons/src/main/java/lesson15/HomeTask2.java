package lesson15;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class HomeTask2 {
    public static void main(String[] args) {
        //1
        LocalDate date1=LocalDate.of(2022,12,12);
        LocalDate date2=LocalDate.now();
        System.out.println(date2.isBefore(date1));
        //3
        LocalDate date3=LocalDate.of(2022,11,11);
        LocalDate date4=date3.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println(date4);
        //4
        LocalDate date5=LocalDate.now();
        LocalDate date6=LocalDate.of(2022,11,14);
        long a= ChronoUnit.DAYS.between(date6,date5);
        System.out.println(a);
        //6
        LocalDateTime date7=LocalDateTime.now();
        DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String date8=date7.format(format);
        //7
        String date9="2022-11-22 11:11:11";
        DateTimeFormatter fomat2=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime date10=LocalDateTime.parse(date9,format);
        System.out.println(date10);
        //8
        LocalTime date11Stop=LocalTime.now();
        LocalTime date12Start=LocalTime.of(12,12,12);
        Duration duration=Duration.between(date12Start,date11Stop);
        long saat=duration.toHours();
        System.out.println(saat);
        //9
        LocalDate date13=LocalDate.now();
        System.out.println(date13.isLeapYear());

    }
}
