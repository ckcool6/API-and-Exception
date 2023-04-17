import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        //method1();
        String start = "2020年11月11日 0:0:0";
        String end = "2020年11月11日 0:10:0";

        String jia = "2020年11月11日 0:03:47";
        String pi = "2020年11月11日 0:10:11";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long startTime = sdf.parse(start).getTime();
        long endTime = sdf.parse(end).getTime();

        long jiatime = sdf.parse(jia).getTime();
        long pitime = sdf.parse(pi).getTime();

        if (jiatime >= startTime && jiatime <= endTime) {
            System.out.println("小jia参与上了秒杀");
        } else {
            System.out.println("小jia没有参与上");
        }
        System.out.println("-------------------------------");
        if (pitime >= startTime && pitime <= endTime) {
            System.out.println("小pi参与上了秒杀");
        } else {
            System.out.println("小pi没有参与上");
        }
    }

    private static void method1() {
        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String result = simpleDateFormat.format(date);
        String result2 = simpleDateFormat2.format(date);
        System.out.println(result);
        System.out.println(result2);
    }
}
