package Other;

public class Test2 {
public static void printOddNumbers(int[] arr) {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            stringBuilder.append(arr[i] + ",");
        }
    }
    Math.abs(14);

    try {
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    } catch (Exception a) {
    }
    System.out.println(stringBuilder);

}

    public static void main(String[] args) {
        int[] a = {};
        printOddNumbers(a);
    }
}
