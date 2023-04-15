public class IntegerTest {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");
        System.out.println(i1);
        System.out.println(i2);

        Integer i3 = 100; //自动装箱

        int i4 = i3;  //自动拆箱

        Integer i5 = 200;  //自动装箱
        i5 += 200;
        System.out.println(i5);

        String s1 = "100";
        int i = 200;
        System.out.println(s1 + i);
        int i6 = Integer.parseInt(s1); //string-->int
        System.out.println(i + i6);

        int i7 = 200;
        String s = String.valueOf(i7); //int-->string
        System.out.println(s);
    }
}
