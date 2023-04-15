import java.util.Objects;

public class ObjectTest {
    public static void main(String[] args) {
        Student stu = null;
        /*
        Student stu1 = new Student("张三","23");
        System.out.println(stu == stu1);
        System.out.println(stu.equals(stu1));
        System.out.println(stu.toString());
        */
        String random = Objects.toString(stu, "random");
        System.out.println(random);
        boolean aNull = Objects.isNull(stu);
        System.out.println(aNull);
    }
}
