package project_1;
/**
 * @author Saul Galaviz
 * @version Alpha 1.0
 */
/////////////////////////////////////////////////////////////////////
public class Engine 
{
	private MenuUI menuUI = new MenuUI();
	//-------------------------------------------------------------------
	public void mainMenu()
	{
	   menuUI.gameStart(); //MenuLoad
      
      int menuOption = menuUI.gameMenu();
      
      switch (menuOption)
      {
         case 1: //New Game
            GameLogic logic = new GameLogic();
            logic.play();
            
            //Logic for a chance to spawn an enemy (Enemy enemyOne = new Enemy();)
            //System.out.println(player.getName()); just testing
            
            break;
         case 2: //Load Game
            break;
         case 3: //Game Manual
            Guide guide = new Guide();
            guide.mainMenu();
            break;
         case 4: //Quit Game
            System.exit(0);
      }  
      
      //Ask name and get name
      //String name = ui.getName();
      
      //Consume next line
      //kb.nextLine();
      
      //Create character object
      //character.get
      
      //Ask user for which profession and set it
      //String userClass = ui.getClass();
      
      //identity.setClass(userClass);
      
      //final String WEAPON = damage.getWeapon(userClass);
      //System.out.println("You have equipped: " + WEAPON);
      
      
      //kb.close();
   }
	//-------------------------------------------------------------------
}
/////////////////////////////////////////////////////////////////////