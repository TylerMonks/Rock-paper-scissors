
package rockpaperscissors;

import java.util.*;

public class RockPaperScissors {

   public static int score;
    public static void main(String[] args) 
            throws InterruptedException {
        
      
         score = 0;
         
         System.out.println("You will be playing rock, paper, scissors against the computer.");
         System.out.println("if you win you get two points");
         System.out.println("if you draw you get one point");
         System.out.println("if you loose you loose one point");
         System.out.println("to quit type in:  quit");
         System.out.println("              ");
         
         
         Thread.sleep(1000);
         
    
         
         
         
         
         playGame();
         
         
         
        
             
       
          
        

    

         
         
         
        
        
        
        
       
    }

  public static void playGame() {
            Random randnum = new Random();
            Scanner myInput = new Scanner(System.in);
            System.out.println("welcome to Rock Paper scissors");
           String choices [] = { "rock", "paper", "scissors",};
           
           try{
            System.out.println("Please enter you choice hand geture thingy");
            String userChoice = myInput.nextLine();
            
            int randomNumber = (int)(Math.random()*3);
            
            String computerChoice = "";
            
            while (true){
                
                
                if (userChoice.equals("quit")){
                    System.out.println("Your score is; " + score);
                    break;
                }
                
                
                
                
                
                
                
                
                
                
                
                
            if (randomNumber==0){
                computerChoice = "rock";
                        
                        
            }else if (randomNumber==1){
                computerChoice = "scissors";
                
            }else if (randomNumber == 2){
                computerChoice = "paper";
                
            }else{
                System.out.println("Oops an error has occured");
            }
        
        System.out.println("Its the computers turn! " + computerChoice);
        
             
        
        if (userChoice.equals(computerChoice)){
            System.out.println("It's a draw");
            score = score + 1;
            
        }else if (userChoice.equals("rock") && computerChoice.equals("scissors") || userChoice.equals("paper") && computerChoice.equals("rock") || userChoice.equals("scissors") && computerChoice.equals("paper")){
            System.out.println("You have won");
            score = score + 2;
            
        }else{
               System.out.println("you have lost");
               score = score  - 1;
           }
            }
            
            
        }catch(Exception e){
                System.out.println("you can only type in letters.");
            }
          
           


    
}
}