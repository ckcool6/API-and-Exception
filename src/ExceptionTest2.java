public class ExceptionTest2 {
    public static void main(String[] args) {
        int[] arr = null;
        try {
            printArr(arr);
        } catch (NullPointerException e){
            System.out.println("参数不能为null");
        }
        System.out.println("hahahahahaha");
    }

    private static void printArr(int[] arr) {
        if (arr == null) {
            throw new NullPointerException();  //抛出空指针异常
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
