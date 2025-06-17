import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array langth");
        int len = sc.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < len; i++) {
            int temp = arr[i];
            for (int j = i + 1; j < len; j++) {
                if (temp == arr[j]) {
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }
}