
package com.mycompany.cricket;
import java.util.Scanner;

public class CricketRunsScored extends Cricket{
     Scanner input = new Scanner(System.in);
    
     String batsmanName;
     String stadiumName;
     int totalRuns;

    public CricketRunsScored(String batsmanName, String stadiumName, int totalRuns) {
        this.batsmanName = batsmanName;
        this.stadiumName = stadiumName;
        this.totalRuns = totalRuns;
    }
     
    System.out.println("The cricketer name: " + batsmansName);
    batsmansName = input.nextLine();
     

    
}

