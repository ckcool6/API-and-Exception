public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 1, 4};

        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        //外层循环控制的次数，比数组的长度少一次
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环实际比较，‘-i’是每一轮结束之后，就会少比一个数字
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
