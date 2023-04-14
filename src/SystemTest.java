public class SystemTest {
    public static void main(String[] args) {
        /*

        long start = System.currentTimeMillis(); //获得当前时间（毫秒）

        int i;
        for (i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);  //for循环运行的时间

        */

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[10];

        System.arraycopy(arr1,0,arr2,0,arr1.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
