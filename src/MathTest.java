//math and system
public class MathTest {
    public static void main(String[] args) {
        int abs = java.lang.Math.abs(-10);
        System.out.println(abs);

        double ceil = java.lang.Math.ceil(10.1);   //向上取整
        System.out.println(ceil);

        double floor = java.lang.Math.floor(10.9);  //向下取整
        System.out.println(floor);

        long round = java.lang.Math.round(10.1);   //四舍五入
        System.out.println(round);

        int max = java.lang.Math.max(10, 11);
        System.out.println(max);

        double pow = java.lang.Math.pow(2, 3);
        System.out.println(pow);

    }

}
