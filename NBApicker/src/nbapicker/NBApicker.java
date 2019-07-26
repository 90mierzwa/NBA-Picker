package nbapicker;

import java.io.IOException;
import java.util.Scanner; 

public class NBApicker {
     
    static float teamACounter = 0;
    static float teamBCounter = 0;
    static float winChanceteamA = 0 ; 
    static float winChanceteamB = 0;
    

    static private float shootingPercent(float[] a, float[] b){
        
        if(a[0] > b[0]){
            teamACounter += 51.471;     // Updated 12/26 
            return teamACounter;
        }
        else 
            teamBCounter += 51.471;
            return teamBCounter;       
    }
    
    static private float winPercent(float[] a, float[] b){ 
        
        if(a[1] > b[1]){
            teamACounter += 62.857;   // Updated 12/26 
            return teamACounter;
        }
        else 
            teamBCounter += 62.857;
            return teamBCounter;       
    }
    
    static private float assists(float[] a, float[] b){
        
         if(a[2] > b[2]){
          teamACounter += 61.029;   // Updated 12/26
            return teamACounter;
        }
        else 
            teamBCounter += 61.029;
            return teamBCounter;
        
    }

    static private float pertainingRecord(float[] a, float[] b){   // Home team's home record vs away teams away record
        
         if(a[3] > b[3]){
             teamACounter += 63.636;                         // Updated 12/26 
            return teamACounter;
        }
        else 
            teamBCounter += 63.636;
            return teamBCounter;
        
    }   

    static private float daysRest(float[] a, float[] b){
        
         if(a[4] > b[4]){
             teamACounter += 63.636;                                 // Updated 12/26 
            return teamACounter;
        }
        else 
            teamBCounter += 63.636;
            return teamBCounter;
        
    } 

    static private float foulsComitted(float[] a, float[] b){  // more fouls committed is bad  
        
         if(a[5] < b[5]){
             teamACounter += 52.941;                           // Updated 12/26           
            return teamACounter;
        }
        else 
            teamBCounter += 52.941;
            return teamBCounter;
        
    }

        static private float freeThrowPercent(float[] a, float[] b){
        
         if(a[6] > b[6]){
             teamACounter += 57.692;                            // Updated 12/26 
            return teamACounter;
        }
        else 
            teamBCounter += 57.692;
            return teamBCounter;
        
    }
    

    
    static private float threePointersPG(float[] a, float[] b){
        
         if(a[7] > b[7]){
             teamACounter += 63.971;                    // Updated 12/26  
            return teamACounter;
        }
        else 
            teamBCounter += 63.971;
            return teamBCounter;
        
    }


    
        
    static private float winPercentLastTenGames(float[] a, float[] b){
        
         if(a[8] > b[8]){
             teamACounter += 68.333;                            // Updated 12/26 
            return teamACounter;
        }
        else 
            teamBCounter += 68.333;
            return teamBCounter;
        
    }      
    
    
    static private float defensiveReboundsPG(float[] a, float[] b) {
        
         if(a[9] > b[9]){
             teamACounter += 56.618;                         // Updated 12/26
            return teamACounter;
        }
        else 
            teamBCounter += 56.618;
            return teamBCounter;
        
    }

    /*static private float PPG(float[] a, float[] b) {
        
         if(a[10] > b[10]){
             teamACounter += 49.333;                // Updated 12/26
            return teamACounter;
        }
        else 
            teamBCounter += 49.333;
            return teamBCounter;
        
    }   */
     
        static private float offensiveRating(float[] a, float[] b){
        
         if(a[11] > b[11]){
             teamACounter += 57.353;                   // Updated 12/26
            return teamACounter;
        }
        else 
            teamBCounter += 57.353;
            return teamBCounter;
        
    }
    
    static private float defensiveRating(float[] a, float[] b){     // Lower defensive rating is better 
        
         if(a[12] < b[12]){
             teamACounter += 56.618;                // Updated 12/26
            return teamACounter;
        }
        else 
            teamBCounter += 56.618;
            return teamBCounter;
        
    }

    static private float homeCourtAdv(float[] a, float[] b){
        
         if(a[13] > b[13]){
              teamACounter += 59.559;           // Updated 12/26 
            return teamACounter;
        }
        else 
            teamBCounter += 59.559;
            return teamBCounter;
        
    }
    
    static private float OPPG(float[] a, float[] b){    
        
         if(a[14] > b[14]){
             teamACounter += 54.667;     
            return teamACounter;
        }
        else 
            teamBCounter += 54.667;
            return teamBCounter;
        
    } 
    
    static private float effectiveFieldGoalPercentage(float[] a, float[] b){
        
         if(a[15] > b[15]){
             teamACounter += 62.5;                // Updated 12/26
            return teamACounter;
        }
        else 
            teamBCounter += 62.5;
            return teamBCounter;
        
    }
    

    
    static private float averageScoringMargin(float[] a, float[] b){
        
         if(a[16] > b[16]){
             teamACounter += 58.824;                    // Updated 12/26
            return teamACounter;
        }
        else 
            teamBCounter += 58.824;
            return teamBCounter;
        
    }
    
    static private float fourthQFTPercent(float[] a, float[] b){
        
         if(a[17] > b[17]){
             teamACounter += 56.818;                    // Updated 12/26
            return teamACounter;
        }
        else 
            teamBCounter += 56.818;
            return teamBCounter;
        
    }
    
    static private float marginLastThreeGames(float[] a, float[] b){
        
         if(a[18] > b[18]){
             teamACounter += 59.091;                    // Updated 12/26
            return teamACounter;
        }
        else 
            teamBCounter += 59.091;
            return teamBCounter;
        
    }
    
  
    public static void main(String[] args) {
        
     
        System.out.println("Please enter two numbers that correspond to the matchup you would like to predict.");        
        for (int i = 0; i < teams.chooseTeam.length; i++){
            System.out.println(i+1 + ". " + teams.chooseTeam[i]);
            
        }
        
        // Make sure the user input is a valid 
        Scanner keyboard = new Scanner(System.in);
        int Pick1 = keyboard.nextInt();
        while (Pick1 > 30) {
            System.out.println("That is not a valid input! Please enter another number from 1-30 for Team 1.");
            Pick1 = keyboard.nextInt();
        } 
         
        int Pick2 = keyboard.nextInt();
        while (Pick2 > 30) {
            System.out.println("That is not a valid input! Please enter a number from 1-30 for Team 2.");
            Pick2 = keyboard.nextInt();
        } 
           
        teamCases tc = new teamCases();
        teams t = new teams();
   
        // Calling functions to compare each statistical category
        shootingPercent(tc.teamPick2(Pick1), tc.teamPick1(Pick2));
        winPercent(tc.teamPick2(Pick1), tc.teamPick1(Pick2));
        assists(tc.teamPick2(Pick1), tc.teamPick1(Pick2));
        pertainingRecord(tc.teamPick2(Pick1), tc.teamPick1(Pick2));
        daysRest(tc.teamPick2(Pick1), tc.teamPick1(Pick2));
        foulsComitted(tc.teamPick2(Pick1), tc.teamPick1(Pick2));
        freeThrowPercent(tc.teamPick2(Pick1), tc.teamPick1(Pick2));        
        threePointersPG(tc.teamPick2(Pick1), tc.teamPick1(Pick2));
        winPercentLastTenGames(tc.teamPick2(Pick1), tc.teamPick1(Pick2));
        defensiveReboundsPG(tc.teamPick2(Pick1), tc.teamPick1(Pick2));
        //PPG(tc.teamPick2(Pick1), tc.teamPick1(Pick2));
        offensiveRating(tc.teamPick2(Pick1), tc.teamPick1(Pick2));
        defensiveRating(tc.teamPick2(Pick1), tc.teamPick1(Pick2));        
        homeCourtAdv(tc.teamPick2(Pick1), tc.teamPick1(Pick2));
        OPPG(tc.teamPick2(Pick1), tc.teamPick1(Pick2));    
        effectiveFieldGoalPercentage(tc.teamPick2(Pick1), tc.teamPick1(Pick2));
        averageScoringMargin(tc.teamPick2(Pick1), tc.teamPick1(Pick2));        
        fourthQFTPercent(tc.teamPick2(Pick1), tc.teamPick1(Pick2));
        marginLastThreeGames(tc.teamPick2(Pick1), tc.teamPick1(Pick2));
        
        winChanceteamA = (teamACounter / (teamACounter + teamBCounter)) * 100;
        winChanceteamB = (teamBCounter / (teamACounter + teamBCounter)) * 100;
        
        System.out.println("Value of teamACounter = " + teamACounter);
        System.out.println("Value of teamBCounter = " + teamBCounter);
        
        if (teamACounter > teamBCounter){
            System.out.println("Team A is projected to win! Team A's chance to win is " + winChanceteamA + "%!");
        }
        
        else
            System.out.println("Team B is projected to win! Team B's chance to win is " + winChanceteamB + "%!");
        
    }      
} 

