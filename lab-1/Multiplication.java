import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int a = sc.nextInt();
        System.out.println("Enter column");
        int b = sc.nextInt();

        int[][] arr = new int[a][b];
        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        
    }
}
