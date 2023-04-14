// BigDecimal 用来精确计算
import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("10.0");
        BigDecimal bigDecimal2 = new BigDecimal("3.0");
        /*
        System.out.println(bigDecimal);
        System.out.println(bigDecimal2);
        */
        BigDecimal add = bigDecimal.add(bigDecimal2);
        System.out.println(add);
        BigDecimal divide = bigDecimal.divide(bigDecimal2,2,BigDecimal.ROUND_UP);
        System.out.println(divide);
    }
}
