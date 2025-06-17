    import java.util.Scanner;

public class Transform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int a = sc.nextInt();
        System.out.println("Enter column");
        int b = sc.nextInt();

        int[][] arr = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }
}
