import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class JDK8Date2 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 11, 11, 11, 11);

        int year = localDateTime.getYear();
        System.out.println(year);

        int month = localDateTime.getMonthValue();
        System.out.println(month);

        int dayOfMonth = localDateTime.getDayOfMonth();
        System.out.println(dayOfMonth);

        int dayOfYear = localDateTime.getDayOfYear();
        System.out.println(dayOfYear);

        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println(dayOfWeek);

        int minute = localDateTime.getMinute();
        System.out.println(minute);

        int hour = localDateTime.getHour();
        System.out.println(hour);

    }
}
