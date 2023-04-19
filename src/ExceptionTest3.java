import java.util.Scanner;

public class ExceptionTest3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入年龄:");
            String line = sc.nextLine();
            int age = Integer.parseInt(line);
            System.out.println(age);
            System.out.println(2 / 0);
        } catch (NumberFormatException e) {
            System.out.println("格式化异常");
        } catch (ArithmeticException e) {
            System.out.println("数学运算异常");
        }
        System.out.println("测试456");
    }
}
