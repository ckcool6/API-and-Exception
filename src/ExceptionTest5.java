import java.util.Scanner;

public class ExceptionTest5 {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        s.setName(name);

        while (true) {
            System.out.println("请输入年龄：");
            String ageStr = sc.nextLine();
            try {
                int age = Integer.parseInt(ageStr);
                s.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("请输入一个整数");
                continue;
            } catch (AgeOutOfBoundException e) {
                System.out.println("请输入一个符合范围的年龄");
                continue;
            }
        }

        System.out.println(s);
    }
}
