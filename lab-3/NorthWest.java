import java.util.*;

public class NorthWest {
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

        if(totalSupply == totalDemand){
            for(int i=0; i<supply.length; i++){
                for(int j=0; j<demand.length; j++){
                    if(supply[i] > demand[j]){
                        allocation[i][j] = demand[j];
                        supply[i] -= demand[j];
                        demand[j] = 0;
                    }
                    else{
                        allocation[i][j] = supply[i];
                        demand[j] -= supply[i];
                        supply[i] = 0;
                        break; 
                    }
                }
            }
        }

        int totalCost = 0;
        for(int i=0; i<supply.length; i++){
            for(int j=0; j<demand.length; j++){
                totalCost += allocation[i][j] * cost[i][j];
            }
        }

        System.out.println(totalCost);
    }
}
