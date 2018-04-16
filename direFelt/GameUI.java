package project_1;

import java.util.Scanner;

public class GameUI
{
   Scanner kb = new Scanner(System.in);
   
   public String move()
   {
      return kb.nextLine();
   }
   
   public void rockAhead()
   {
      System.out.println("\nYou can't move that direction. There is a rock in your path.");
   }
   
   public void wallAhead()
   {
      System.out.println("\nYou can't move that direction. There is a wall.");
   }
   
//   public void enemyEncountered(String enemyName)
//   {
//      System.out.println("\nYou have encountered a wild " + enemyName + "!");
//   }
   
   public void playerDead()
   {
      System.out.println("\nYOU HAVE DIED.");
   }
   
   public void enemyDead(String enemyName)
   {
      System.out.println("\nYou killed the " + enemyName + ".");
   }
   
  
}
