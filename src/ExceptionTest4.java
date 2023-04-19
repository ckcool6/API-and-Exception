public class ExceptionTest4 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(); //把错误信息输出在控制台
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
