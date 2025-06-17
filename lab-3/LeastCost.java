import java.util.*;

public class LeastCost {
    public static void main(String[] args) {
        int[][] cost = {
                { 12, 10, 12, 13 },
                { 7, 11, 8, 14 },
                { 6, 16, 11, 7 }
        };

        int[][] temp = cost;

        int[] demand = { 180, 150, 350, 320 };
        int[] supply = { 500, 300, 200 };

        int totalSupply = Arrays.stream(supply).sum();
        int totalDemand = Arrays.stream(demand).sum();
        int[][] allocation = new int[3][4];

        int minCost = findMin(temp, 3, 4);
        int[] costIndex = findIndex(cost, 3, 4, minCost);

        // in costIndex arr[0]=supply=i & arr[1]=demand=j
        int i = costIndex[0], j = costIndex[1];

        while (totalDemand != 0 || totalSupply != 0) {
            if (supply[i] > demand[j]) {
                allocation[i][j] = demand[j];
                System.out.println(allocation[i][j]);
                supply[i] += demand[j];
                demand[j] = 0;
                temp[i][j] = 0;
                minCost = findMin(temp, 3, 4);
                totalDemand = Arrays.stream(demand).sum();
                totalSupply =  Arrays.stream(supply).sum();
            }
        }

        // int totalCost = 0;
        // for(int x=0; x<supply.length; x++){
        // for(int y=0; y<demand.length; y++){
        // totalCost += allocation[x][y] * cost[x][y];
        // }
        // }

        // System.out.println(totalCost);
    }

    public static int findMin(int[][] temp, int row, int col) {
        int min = temp[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (temp[i][j] < min) {
                    min = temp[i][j];
                }
            }
        }
        return min;
    }

    public static int[] findIndex(int[][] arr, int row, int col, int minCost) {
        int x = 0, y = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == minCost) {
                    x = i;
                    y = j;
                }
            }
        }
        int[] indexs = { x, y };
        return indexs;
    }
}
