import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JDK8Date3 {
    public static void main(String[] args) {
        //method();
        //method2();
        String s = "2020年11月12日 13:14:15";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        LocalDateTime parseTime = LocalDateTime.parse(s, dateTimeFormatter);
        System.out.println(parseTime);

    }

    private static void method2() {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 12, 13, 14, 15);
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String format = localDateTime.format(dateTimeFormatter);
        System.out.println(format);
    }

    private static void method() {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 12, 12, 10, 45);

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
    }
}
