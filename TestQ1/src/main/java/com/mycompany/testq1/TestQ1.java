
package com.mycompany.testq1;
import java.util.Scanner;
public class TestQ1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String [] Stadium = {"KingsMead", "St Georges", "Wanderers"};
        String [] Batsmen = {"Jacques Kallis", "Hashim  Amla", "AB De Villiers"};
        
        int [][] runs = new int[Stadium.length][Batsmen.length];
        System.out.println("SA CRICKETER APPLICATION\n");
        System.out.println("-------------------------------------------------------------");
        
        for (int i = 0; i < Stadium.length; i++){
            for (int j = 0; j < Batsmen.length; j++){
                System.out.println("Enter the number of runs scored by " + Batsmen[j] + " at " + Stadium[i] + ": ");
                runs[i][j] = input.nextInt();
            }
        }
        
        System.out.println("\nRUNS SCORED REPORT");
        
        for (int i = 0; i < Stadium.length; i++){
            for (int j = 0; j < Batsmen.length; j++){
                System.out.println(Batsmen[j] + "runs scored at " + Stadium[i] + ": " + runs[i][j]);  
            }
            System.out.println();
        }
        
        int[] StadiumTotal = new int[Stadium.length];
        for (int i = 0; i < Stadium.length; i++){
            for (int j = 0; i < Batsmen.length; j++){
                StadiumTotal[i] += runs[i][j];
            }
        }
        
        System.out.println("TOTAL RUNS AT STADIUMS");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < Stadium.length; i++){
            System.out.println(Stadium[i] + "\t" + StadiumTotal[i]);
        }
        
        int maxRuns = StadiumTotal[0];
        String bestStadium = Stadium[0];
        for (int i = 1; i < Stadium.length; i++){
            if (StadiumTotal[i] > maxRuns){
                maxRuns = StadiumTotal[i];
                bestStadium = Stadium[i];
            }
        }
        
        System.out.println("\nSTADIUM WITH THE MOST RUNS: " + bestStadium);
       
    }
}
