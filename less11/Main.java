package less11;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        LocalTime a  = LocalTime.now();
        LocalDate b = LocalDate.now();
        System.out.println(a + " " + b);
        System.out.println(b + " " + a);
        System.out.println(Month.APRIL);
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.parse("2022-10-12"));
        System.out.println(LocalDate.now().getMonth());
        System.out.println(LocalDate.now().getDayOfMonth());
        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().getYear());
        System.out.println(LocalTime.now().getHour());
        System.out.println(ZonedDateTime.now());
        System.out.println(LocalTime.now(ZoneId.of("Africa/Asmara")));
        var currentDate = LocalDate.now();
        var dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        System.out.println(dateTimeFormatter.format(currentDate));
        var dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(dateTimeFormatter2.format(currentDate));
    }
}
