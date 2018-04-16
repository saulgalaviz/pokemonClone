package project_1;
/**
 * @author Saul Galaviz
 * @version Alpha 1.0
 */
import java.util.Scanner;
/////////////////////////////////////////////////////////////////////
public class MenuUI 
{
	Scanner kb = new Scanner(System.in);
	//-------------------------------------------------------------------
	public void gameStart()
	{
		System.out.println("‡=====================================‡");
		System.out.println("‡              DireFelt               ‡");
		System.out.println("‡     ‡     By Saul Galaviz     ‡     ‡");
		System.out.println("‡              Alpha 1.0              ‡");
		System.out.println("‡=====================================‡");
		System.out.println("‡       Press enter to continue       ‡");
		System.out.println("‡=====================================‡");
		kb.nextLine();
	}
	//-------------------------------------------------------------------
	public int gameMenu()
	{
		int testInput = 0;
      int input = -1;
      
      do
      {
         try
         {
            do
            {
               System.out.println("\n‡===================================‡");
               System.out.println("‡       Select desired option       ‡");
               System.out.println("‡===================================‡");
               System.out.println("‡ [1] Start New Game                ‡");
               System.out.println("‡ [2] Load Existing Game            ‡");
               System.out.println("‡ [3] View Game Manual              ‡");
               System.out.println("‡ [4] Exit Game                     ‡");
               System.out.println("‡===================================‡");
               input = kb.nextInt();
               
               if (input > 4 || input < 1)
               {
                  System.out.println("\n‡====================================‡");
                  System.out.println("‡   You selected an invalid option   ‡");
                  System.out.println("‡====================================‡");
                  kb.nextLine();
               }
            }
            while(input > 4 || input < 1);
            
            testInput = 1;
         }  
         catch(Exception e)
         {
            System.out.println("\n‡====================================‡");
            System.out.println("‡   Please select an integer value   ‡");
            System.out.println("‡====================================‡");
            kb.nextLine();
         }
      } 
      while(testInput == 0);
      
      return input;
	}
	//-------------------------------------------------------------------
	public String getName()
	{
	   String toBeName;
	   
      do
      {
         System.out.println("\n‡===================================‡");
         System.out.println("‡        What is your name?         ‡");
         System.out.println("‡===================================‡");
         toBeName = kb.nextLine();
         
          if (toBeName.length() <= 0)
          {
             System.out.println("\n‡==============================================‡");
             System.out.println("‡ Your name must be greater than 0 characters! ‡");
             System.out.println("‡==============================================‡");
             toBeName = "invalid";
             kb.nextLine();
          }
          
          if (toBeName.length() > 8)
          {
             System.out.println("\n‡=============================================‡");
             System.out.println("‡   Your name must not exceed 8 characters!   ‡");
             System.out.println("‡=============================================‡");
             toBeName = "invalid";
             kb.nextLine();
          }
      }
      while (toBeName.equals("invalid"));
      
      return toBeName;
	}
	
	public String setName()
	{
	   int testInput = 0;
	   int input = -1;
	   String toBeName = "unidentified";
	   
	   do
	   {
//	      try
//         {
	      toBeName = getName();
   	      do
   	      { 
   	         //toBeName = getName();
   	         try
   	         {
   	         do
   	         {
   	            switch(toBeName.length())
   	            {
   	               case 1:
   	                  System.out.println("\n‡==========================================‡");
   	                  System.out.println("‡ Are you sure you want " + toBeName + " to be your name? ‡");
   	                  System.out.println("‡==========================================‡");
   	                  System.out.println("‡ [1] No                                   ‡");
   	                  System.out.println("‡ [2] Yes                                  ‡");
   	                  System.out.println("‡==========================================‡");
   	                  break;
      	            case 2:
      	               System.out.println("\n‡===========================================‡");
      	               System.out.println("‡ Are you sure you want " + toBeName + " to be your name? ‡");
      	               System.out.println("‡===========================================‡");
      	               System.out.println("‡ [1] No                                    ‡");
      	               System.out.println("‡ [2] Yes                                   ‡");
      	               System.out.println("‡===========================================‡");
      	               break;
      	            case 3:
      	               System.out.println("\n‡============================================‡");
      	               System.out.println("‡ Are you sure you want " + toBeName + " to be your name? ‡");
      	               System.out.println("‡============================================‡");
      	               System.out.println("‡ [1] No                                     ‡");
      	               System.out.println("‡ [2] Yes                                    ‡");
      	               System.out.println("‡============================================‡");
      	               break;
      	            case 4:
      	               System.out.println("\n‡=============================================‡");
      	               System.out.println("‡ Are you sure you want " + toBeName + " to be your name? ‡");
      	               System.out.println("‡=============================================‡");
      	               System.out.println("‡ [1] No                                      ‡");
      	               System.out.println("‡ [2] Yes                                     ‡");
      	               System.out.println("‡=============================================‡");
      	               break;
      	            case 5:
      	               System.out.println("\n‡==============================================‡");
      	               System.out.println("‡ Are you sure you want " + toBeName + " to be your name? ‡");
      	               System.out.println("‡==============================================‡");
      	               System.out.println("‡ [1] No                                       ‡");
      	               System.out.println("‡ [2] Yes                                      ‡");
      	               System.out.println("‡==============================================‡");
      	               break;
      	            case 6:
      	               System.out.println("\n‡===============================================‡");
      	               System.out.println("‡ Are you sure you want " + toBeName + " to be your name? ‡");
      	               System.out.println("‡===============================================‡");
      	               System.out.println("‡ [1] No                                        ‡");
      	               System.out.println("‡ [2] Yes                                       ‡");
      	               System.out.println("‡===============================================‡");
      	               break;
      	            case 7:
      	               System.out.println("\n‡================================================‡");
      	               System.out.println("‡ Are you sure you want " + toBeName + " to be your name? ‡");
      	               System.out.println("‡================================================‡");
      	               System.out.println("‡ [1] No                                         ‡");
      	               System.out.println("‡ [2] Yes                                        ‡");
      	               System.out.println("‡================================================‡");
      	               break;
      	            case 8:
      	               System.out.println("\n‡=================================================‡");
      	               System.out.println("‡ Are you sure you want " + toBeName + " to be your name? ‡");
      	               System.out.println("‡=================================================‡");
      	               System.out.println("‡ [1] No                                          ‡");
      	               System.out.println("‡ [2] Yes                                         ‡");
      	               System.out.println("‡=================================================‡");
      	               break;
      	            case 9:
      	               System.out.println("\n‡==================================================‡");
      	               System.out.println("‡ Are you sure you want " + toBeName + " to be your name? ‡");
      	               System.out.println("‡==================================================‡");
      	               System.out.println("‡ [1] No                                           ‡");
      	               System.out.println("‡ [2] Yes                                          ‡");
      	               System.out.println("‡==================================================‡");
      	               break;
      	            case 10:
      	               System.out.println("\n‡==================================================‡");
      	               System.out.println("‡ Are you sure you want " + toBeName + " to be your name? ‡");
      	               System.out.println("‡==================================================‡");
      	               System.out.println("‡ [1] No                                           ‡");
      	               System.out.println("‡ [2] Yes                                          ‡");
      	               System.out.println("‡==================================================‡");
   	            }             
   	            input = kb.nextInt();
   	            
   	            if (input != 2 && input != 1)
   	            {
   	               System.out.println("\n‡====================================‡");
   	               System.out.println("‡   You selected an invalid option   ‡");
   	               System.out.println("‡====================================‡");
   	               kb.nextLine();
   	            }
   	         }
   	         while(input > 2 || input < 1);
   	         testInput = 1;
   	      }
         catch(Exception e)
         {
            System.out.println("\n‡====================================‡");
            System.out.println("‡   Please select an integer value   ‡");
            System.out.println("‡====================================‡");
            kb.nextLine();
         }
   	      }
	         while(input == 1);
	         
	       
//	      catch(Exception e)
//	      {
//	         System.out.println("\n‡====================================‡");
//	         System.out.println("‡   Please select an integer value   ‡");
//	         System.out.println("‡====================================‡");
//	         kb.nextLine();
//	      }
	   
	   }
	   while(testInput == 0);
   		
		return toBeName;
	}
	//-------------------------------------------------------------------
	
	
   public String setHero()
   {
      System.out.println("\n‡============================‡");
      System.out.println("‡      Choose your Hero      ‡");
      System.out.println("‡============================‡");
      System.out.println("‡ [1] Marksman               ‡");
      System.out.println("‡ [2] Pyromancer             ‡");
      System.out.println("‡ [3] Juggernaut             ‡");
      System.out.println("‡============================‡");
		int option = kb.nextInt();
		
		String toBeHero = "unidentified";
		
		switch(option){
			case 1:
				toBeHero = "marksman";
				break;
			case 2:
				toBeHero = "pyromancer";
				break;
			case 3:
				toBeHero = "juggernaut";
				break;
			default:
			   System.out.println("\n‡====================================‡");
		      System.out.println("‡   You selected an invalid option   ‡");
		      System.out.println("‡====================================‡");
				setHero();
		}
		if (toBeHero.equals("marksman"))
		{
		   System.out.println("\n‡====================================================‡");
	      System.out.println("‡ Are you sure you want to select the " + toBeHero + " hero? ‡");
	      System.out.println("‡====================================================‡");
	      System.out.println("‡ [1] No                                             ‡");
	      System.out.println("‡ [2] yes                                            ‡");
	      System.out.println("‡====================================================‡");
		}
		else
		{
		   System.out.println("\n‡======================================================‡");
	      System.out.println("‡ Are you sure you want to select the " + toBeHero + " hero? ‡");
	      System.out.println("‡======================================================‡");
	      System.out.println("‡ [1] No                                               ‡");
	      System.out.println("‡ [2] yes                                              ‡");
	      System.out.println("‡======================================================‡");
		}
		int decision = kb.nextInt();
		
		if(decision == 1)
		   setHero();
		
		
		return toBeHero;
	}
   //-------------------------------------------------------------------
}
/////////////////////////////////////////////////////////////////////
