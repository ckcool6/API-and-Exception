import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionTest {
    public static void main(String[] args) throws ParseException {
        method1();
        method2();
    }

    private static void method2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        sdf.parse("2048年10月10日");
    }

    private static void method1() throws NullPointerException {
        int[] arr = null;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
