package project_1;

import java.util.Scanner;

public class Battlefield
{
   private GameUI ui = new GameUI();
   private Scanner kb = new Scanner(System.in);
   
   public void battle(GameEntity player, GameEntity enemy)
   {
      //ui.enemyEncountered(enemy.getName());
      
//      while (player.getHealth() > 0 || enemy.getHealth() > 0 )
//      {
//         printBattlefield();
//      }
      //textBox(enemy);
      kb.nextLine();
      //printBattlefield();
      
      if (enemy.getHealth() <= 0)
      {
         ui.enemyDead(enemy.getName());
      }
      
      else if (player.getHealth() <= 0)
      {
         ui.playerDead();
         player.setCurrentGrid(1);
         player.setLocation(7, 3);
      }
   }
   
//   public void printBattlefield()
//   {
//      for (int y = 15; y > -1; y--)
//      {
//         for (int x = 0; x < 15; x++)
//         {
//            switch(x)
//            { 
//               case 0:
//                  switch(y)
//                  {
//                     case 14: System.out.print("   ‡=");
//                     break;
//                     case 13: System.out.print("   ‡ ");
//                     break;
//                     case 12: System.out.print("   ‡ ");
//                     break;
//                     case 11: System.out.print("   ‡ ");
//                     break;
//                     case 10: System.out.print("   ‡ ");
//                     break;
//                     case 9: System.out.print ("   ‡ ");
//                     break;
//                     case 8: System.out.print ("   ‡ ");
//                     break;
//                     case 7: System.out.print ("   ‡ ");
//                     break;
//                     case 6: System.out.print ("   ‡ ");
//                     break;
//                     case 5: System.out.print ("   ‡ ");
//                     break;
//                     case 4: System.out.print ("   ‡ ");
//                     break;
//                     case 3: System.out.print ("   ‡ ");
//                     break;
//                     case 2: System.out.print ("   ‡ ");
//                     break;
//                     case 1: System.out.print ("   ‡ ");
//                     break;
//                     case 0: System.out.print ("   ‡=");
//                  }
//               break;
//               
//               case 1:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//                  
//               case 2:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 3:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 4:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 5:
//                  switch(y)
//                  {
//                     case 14: System.out.print("====="); 
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");  
//                  }
//               break;
//               
//               case 6:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 7:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 8:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 9:
//                  switch(y)
//                  {
//                  case 14: System.out.print("=====");
//                  break;
//                  case 13: System.out.print("     ");
//                  break;
//                  case 12: System.out.print("     ");
//                  break;
//                  case 11: System.out.print("     ");
//                  break;
//                  case 10: System.out.print("     ");
//                  break;
//                  case 9: System.out.print ("     ");
//                  break;
//                  case 8: System.out.print ("     ");
//                  break;
//                  case 7: System.out.print ("     ");
//                  break;
//                  case 6: System.out.print ("   ‡=");
//                  break;
//                  case 5: System.out.print ("   ‡ ");
//                  break;
//                  case 4: System.out.print ("   ‡=");
//                  break;
//                  case 3: System.out.print ("   ‡ ");
//                  break;
//                  case 2: System.out.print ("   ‡=");
//                  break;
//                  case 1: System.out.print ("     ");
//                  break;
//                  case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 10:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("=====");
//                     break;
//                     case 5: System.out.print ("Battl");
//                     break;
//                     case 4: System.out.print ("=====");
//                     break;
//                     case 3: System.out.print ("Escap");
//                     break;
//                     case 2: System.out.print ("=====");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 11:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("=====");
//                     break;
//                     case 5: System.out.print ("e [1]");
//                     break;
//                     case 4: System.out.print ("=====");
//                     break;
//                     case 3: System.out.print ("e [2]");
//                     break;
//                     case 2: System.out.print ("=====");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 12:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("=‡   ");
//                     break;
//                     case 5: System.out.print (" ‡   ");
//                     break;
//                     case 4: System.out.print ("=‡   ");
//                     break;
//                     case 3: System.out.print (" ‡   ");
//                     break;
//                     case 2: System.out.print ("=‡   ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 13:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 14:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=‡   ");
//                     System.out.println();
//                     break;
//                     case 13: System.out.print(" ‡   ");
//                     System.out.println();
//                     break;
//                     case 12: System.out.print(" ‡   ");
//                     System.out.println();
//                     break;
//                     case 11: System.out.print(" ‡   ");
//                     System.out.println();
//                     break;
//                     case 10: System.out.print(" ‡   ");
//                     System.out.println();
//                     break;
//                     case 9: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 8: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 7: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 6: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 5: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 4: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 3: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 2: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 1: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 0: System.out.print ("=‡   ");
//                     System.out.println();
//                  }
//            }
//         }
//      }
//   }
   
//   public void textBox(GameEntity enemy) 
//   {
//      for (int y = 15; y > -1; y--)
//      {
//         for (int x = 0; x < 15; x++)
//         {
//            switch(x)
//            { 
//               case 0:
//                  switch(y)
//                  {
//                     case 14: System.out.print("   ‡=");
//                     break;
//                     case 13: System.out.print("   ‡ ");
//                     break;
//                     case 12: System.out.print("   ‡ ");
//                     break;
//                     case 11: System.out.print("   ‡ ");
//                     break;
//                     case 10: System.out.print("   ‡ ");
//                     break;
//                     case 9: System.out.print ("   ‡ ");
//                     break;
//                     case 8: System.out.print ("   ‡ ");
//                     break;
//                     case 7: System.out.print ("   ‡ ");
//                     break;
//                     case 6: System.out.print ("   ‡ ");
//                     break;
//                     case 5: System.out.print ("   ‡ ");
//                     break;
//                     case 4: System.out.print ("   ‡ ");
//                     break;
//                     case 3: System.out.print ("   ‡ ");
//                     break;
//                     case 2: System.out.print ("   ‡ ");
//                     break;
//                     case 1: System.out.print ("   ‡ ");
//                     break;
//                     case 0: System.out.print ("   ‡=");
//                  }
//               break;
//               
//               case 1:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//                  
//               case 2:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 3:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 4:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("    ‡");
//                     break;
//                     case 4: System.out.print ("    ‡");
//                     break;
//                     case 3: System.out.print ("    ‡");
//                     break;
//                     case 2: System.out.print ("    ‡");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 5:
//                  switch(y)
//                  {
//                     case 14: System.out.print("====="); 
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("=====");
//                     break;
//                     case 4: System.out.print (" You ");
//                     break;
//                     case 3: System.out.print (" wild");
//                     break;
//                     case 2: System.out.print ("=====");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");  
//                  }
//               break;
//               
//               case 6:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("=====");
//                     break;
//                     case 4: System.out.print ("have ");
//                     break;
//                     case 3: 
//                        if (enemy.getName().equals("Zombie"))
//                           System.out.print(" Zomb");
//                        else if(enemy.getName().equals("Skeleton"))
//                           System.out.print(" Skel");
//                        else if(enemy.getName().equals("Goblin"))
//                           System.out.print(" Gobl");
//                     break;
//                     case 2: System.out.print ("=====");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 7:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("=====");
//                     break;
//                     case 4: System.out.print ("encou");
//                     break;
//                     case 3: 
//                        if(enemy.getName().equals("Zombie"))
//                           System.out.print("ie!  ");
//                        else if(enemy.getName().equals("Skeleton"))
//                           System.out.print("eton!");
//                        else if(enemy.getName().equals("Goblin"))
//                           System.out.print("in!  ");
//                     break;
//                     case 2: System.out.print ("=====");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 8:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("=====");
//                     break;
//                     case 4: System.out.print ("ntere");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("=====");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 9:
//                  switch(y)
//                  {
//                  case 14: System.out.print("=====");
//                  break;
//                  case 13: System.out.print("     ");
//                  break;
//                  case 12: System.out.print("     ");
//                  break;
//                  case 11: System.out.print("     ");
//                  break;
//                  case 10: System.out.print("     ");
//                  break;
//                  case 9: System.out.print ("     ");
//                  break;
//                  case 8: System.out.print ("     ");
//                  break;
//                  case 7: System.out.print ("     ");
//                  break;
//                  case 6: System.out.print ("     ");
//                  break;
//                  case 5: System.out.print ("=====");
//                  break;
//                  case 4: System.out.print ("d a  ");
//                  break;
//                  case 3: System.out.print ("     ");
//                  break;
//                  case 2: System.out.print ("=====");
//                  break;
//                  case 1: System.out.print ("     ");
//                  break;
//                  case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 10:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("‡    ");
//                     break;
//                     case 4: System.out.print ("‡    ");
//                     break;
//                     case 3: System.out.print ("‡    ");
//                     break;
//                     case 2: System.out.print ("‡    ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 11:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 12:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 13:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 14:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=‡   ");
//                     System.out.println();
//                     break;
//                     case 13: System.out.print(" ‡   ");
//                     System.out.println();
//                     break;
//                     case 12: System.out.print(" ‡   ");
//                     System.out.println();
//                     break;
//                     case 11: System.out.print(" ‡   ");
//                     System.out.println();
//                     break;
//                     case 10: System.out.print(" ‡   ");
//                     System.out.println();
//                     break;
//                     case 9: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 8: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 7: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 6: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 5: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 4: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 3: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 2: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 1: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 0: System.out.print ("=‡   ");
//                     System.out.println();
//                  }
//            }
//         }
//      }
//   }
//   public void printBattlefield() --Almost Naked Map
//   {
//      for (int y = 15; y > -1; y--)
//      {
//         for (int x = 0; x < 15; x++)
//         {
//            switch(x)
//            { 
//               case 0:
//                  switch(y)
//                  {
//                     case 14: System.out.print("   ‡=");
//                     break;
//                     case 13: System.out.print("   ‡ ");
//                     break;
//                     case 12: System.out.print("   ‡ ");
//                     break;
//                     case 11: System.out.print("   ‡ ");
//                     break;
//                     case 10: System.out.print("   ‡ ");
//                     break;
//                     case 9: System.out.print ("   ‡ ");
//                     break;
//                     case 8: System.out.print ("   ‡ ");
//                     break;
//                     case 7: System.out.print ("   ‡ ");
//                     break;
//                     case 6: System.out.print ("   ‡ ");
//                     break;
//                     case 5: System.out.print ("   ‡ ");
//                     break;
//                     case 4: System.out.print ("   ‡ ");
//                     break;
//                     case 3: System.out.print ("   ‡ ");
//                     break;
//                     case 2: System.out.print ("   ‡ ");
//                     break;
//                     case 1: System.out.print ("   ‡ ");
//                     break;
//                     case 0: System.out.print ("   ‡=");
//                  }
//               break;
//               
//               case 1:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//                  
//               case 2:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 3:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 4:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("    ‡");
//                     break;
//                     case 4: System.out.print ("    ‡");
//                     break;
//                     case 3: System.out.print ("    ‡");
//                     break;
//                     case 2: System.out.print ("    ‡");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 5:
//                  switch(y)
//                  {
//                     case 14: System.out.print("====="); 
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("=====");
//                     break;
//                     case 4: System.out.print (" wild");
//                     break;
//                     case 3: System.out.print (" You ");
//                     break;
//                     case 2: System.out.print ("=====");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");  
//                  }
//               break;
//               
//               case 6:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("=====");
//                     break;
//                     case 4: System.out.print (" Zomb");
//                     break;
//                     case 3: System.out.print ("have ");
//                     break;
//                     case 2: System.out.print ("=====");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 7:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("=====");
//                     break;
//                     case 4: System.out.print ("ie!  ");
//                     break;
//                     case 3: System.out.print ("encou");
//                     break;
//                     case 2: System.out.print ("=====");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 8:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("=====");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("ntere");
//                     break;
//                     case 2: System.out.print ("=====");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 9:
//                  switch(y)
//                  {
//                  case 14: System.out.print("=====");
//                  break;
//                  case 13: System.out.print("     ");
//                  break;
//                  case 12: System.out.print("     ");
//                  break;
//                  case 11: System.out.print("     ");
//                  break;
//                  case 10: System.out.print("     ");
//                  break;
//                  case 9: System.out.print ("     ");
//                  break;
//                  case 8: System.out.print ("     ");
//                  break;
//                  case 7: System.out.print ("     ");
//                  break;
//                  case 6: System.out.print ("   ‡=");
//                  break;
//                  case 5: System.out.print ("   ‡ ");
//                  break;
//                  case 4: System.out.print ("   ‡=");
//                  break;
//                  case 3: System.out.print ("   ‡ ");
//                  break;
//                  case 2: System.out.print ("   ‡=");
//                  break;
//                  case 1: System.out.print ("     ");
//                  break;
//                  case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 10:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("=====");
//                     break;
//                     case 5: System.out.print ("Battl");
//                     break;
//                     case 4: System.out.print ("=====");
//                     break;
//                     case 3: System.out.print ("Escap");
//                     break;
//                     case 2: System.out.print ("=====");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 11:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("=====");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("=====");
//                     break;
//                     case 3: System.out.print ("e [1]");
//                     break;
//                     case 2: System.out.print ("=====");
//                     break;
//                     case 1: System.out.print ("e [2]");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 12:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("=‡   ");
//                     break;
//                     case 5: System.out.print (" ‡   ");
//                     break;
//                     case 4: System.out.print ("=‡   ");
//                     break;
//                     case 3: System.out.print (" ‡   ");
//                     break;
//                     case 2: System.out.print ("=‡   ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 13:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=====");
//                     break;
//                     case 13: System.out.print("     ");
//                     break;
//                     case 12: System.out.print("     ");
//                     break;
//                     case 11: System.out.print("     ");
//                     break;
//                     case 10: System.out.print("     ");
//                     break;
//                     case 9: System.out.print ("     ");
//                     break;
//                     case 8: System.out.print ("     ");
//                     break;
//                     case 7: System.out.print ("     ");
//                     break;
//                     case 6: System.out.print ("     ");
//                     break;
//                     case 5: System.out.print ("     ");
//                     break;
//                     case 4: System.out.print ("     ");
//                     break;
//                     case 3: System.out.print ("     ");
//                     break;
//                     case 2: System.out.print ("     ");
//                     break;
//                     case 1: System.out.print ("     ");
//                     break;
//                     case 0: System.out.print ("=====");
//                  }
//               break;
//               
//               case 14:
//                  switch(y)
//                  {
//                     case 14: System.out.print("=‡   ");
//                     System.out.println();
//                     break;
//                     case 13: System.out.print(" ‡   ");
//                     System.out.println();
//                     break;
//                     case 12: System.out.print(" ‡   ");
//                     System.out.println();
//                     break;
//                     case 11: System.out.print(" ‡   ");
//                     System.out.println();
//                     break;
//                     case 10: System.out.print(" ‡   ");
//                     System.out.println();
//                     break;
//                     case 9: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 8: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 7: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 6: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 5: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 4: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 3: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 2: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 1: System.out.print (" ‡   ");
//                     System.out.println();
//                     break;
//                     case 0: System.out.print ("=‡   ");
//                     System.out.println();
//                  }
//            }
//         }
//      }
//   }
}
