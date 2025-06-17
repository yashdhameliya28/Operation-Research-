import java.util.*;

public class north_west {
    public static void main(String[] args) {
        int[][] cost = {
                { 12, 10, 12, 13 },
                { 7, 11, 8, 14 },
                { 6, 16, 11, 7 }
        };

        int[] demand = { 180, 150, 350, 320 };
        int[] supply = { 500, 300, 200 };

        int totalSupply = Arrays.stream(supply).sum();
        int totalDemand = Arrays.stream(demand).sum();
        int[][] allocation = new int[3][4];
        int i = 0, j = 0;

        if (totalDemand == totalSupply) {
            while (i < supply.length && j < demand.length) {
                if (supply[i] > demand[j]) {
                    allocation[i][j] = demand[j];
                    supply[i] -= demand[j];
                   demand[j] = 0;
                    j++;
                } else if (demand[j] > supply[i]) {    
                    allocation[i][j] = supply[i];
                    demand[j] -= supply[i];
                    supply[i] = 0;
                    i++;
                } 
                else{
                    allocation[i][j] = supply[i];
                    supply[i] = 0;
                    demand[j] = 0;
                    i++;
                    j++;
                }
            }
        }
        int totalCost = 0; 
        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                totalCost += allocation[i][j] * cost[i][j];
            }
        }

        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                System.out.print(allocation[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println(totalCost);
    }

}
