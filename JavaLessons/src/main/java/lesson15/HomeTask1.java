package lesson15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class HomeTask1 {
    public static void main(String[] args) {
        //3
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        String month = String.valueOf(date.getMonth());
        //4
        LocalTime currentTime = LocalTime.now();
        //5
        LocalTime localTime = LocalTime.of(12, 11, 11);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        String dateString = localTime.format(format);
        System.out.println(dateString);
        //6
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        //7
        LocalDate localdate = LocalDate.of(2022, 2, 2);
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String s = localdate.format(format2);
        System.out.println(s);
        //8
        LocalTime time = LocalTime.of(15, 15, 15);
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String s2 = time.format(format3);
        //9
        LocalDate date2 = LocalDate.now();
        System.out.println(date2.plus(5,ChronoUnit.DAYS));
        //10
        LocalTime time4=LocalTime.now();
        System.out.println(time4.plus(3,ChronoUnit.HOURS));


    }


}
