public class TestInteger {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] sArr = s.split(" ");
        int[] numArr = new int[sArr.length];

        for (int i = 0; i < sArr.length; i++) {
            int num = Integer.parseInt(sArr[i]);
            numArr[i] = num;
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }
    }
}
