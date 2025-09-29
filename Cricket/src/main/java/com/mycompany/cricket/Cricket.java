package com.mycompany.cricket;
import java.util.Scanner;
public class Cricket {
    
    public interface ICricket{
        String getBatsman();
        String getStadium();
        int getRunsScored();
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter batsman name: ");
        String batsmanName = scanner.nextLine();

        System.out.print("Enter stadium name: ");
        String stadiumName = scanner.nextLine();

        System.out.print("Enter total runs scored: ");
        int totalRuns = scanner.nextInt();

        CricketRunsScored score = new CricketRunsScored(batsmanName, stadiumName, totalRuns);
        System.out.println();
        System.out.println(score);
        
    }
}
