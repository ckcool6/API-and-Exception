//二分查找的前提是已经排好序
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = 8;

        int index = binarySearchForindex(arr, number);
        System.out.println(index);

    }

    private static int binarySearchForindex(int[] arr, int number) {
        //查找范围
        int min = 0;
        int max = arr.length - 1;
        //循环查找
        while (min <= max) {
            int mid = (min + max) >> 1;
            if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[mid] < number) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
