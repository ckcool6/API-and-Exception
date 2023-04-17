import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        //test1Data();
        Date date1 = new Date();
        long time = date1.getTime(); //当前时间毫秒值
        System.out.println(time);

        long time2 = System.currentTimeMillis(); //当前时间毫秒值
        System.out.println(time2);

    }

    private static void test1Data() {
        Date date = new Date(0L);
        System.out.println(date);

        Date date1 = new Date();
        System.out.println(date1);

        Date date2 = new Date(3600 * 1000);
        System.out.println(date2);
    }
}
