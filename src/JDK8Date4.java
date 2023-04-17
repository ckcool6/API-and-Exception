import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class JDK8Date4 {
    public static void main(String[] args) {
        //method1();
        LocalDate localDate = LocalDate.of(2020, 12, 1);
        LocalDate localDate1 = LocalDate.of(2021, 12, 1);
        Period period = Period.between(localDate,localDate1);
        System.out.println(period);

    }

    private static void method1() {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 12, 1, 10, 25);
        LocalDateTime localDateTime1 = localDateTime.plusYears(1);
        System.out.println(localDateTime1);
    }
}
