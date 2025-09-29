
package com.mycompany.cricket;

public class RunApplication {
    
 
    
     private String batsmanName;
    private String stadiumName;
    private int totalRuns;

    public CricketImpl(String batsmanName, String stadiumName, int totalRuns) {
        this.batsmanName = batsmanName;
        this.stadiumName = stadiumName;
        this.totalRuns = totalRuns;
    }

    public String getBatsmanName() {
        return batsmanName;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public int getTotalRuns() {
        return totalRuns;
    }
}
}
