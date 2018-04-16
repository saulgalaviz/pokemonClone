package project_1;
/**
 * @author Saul Galaviz
 * @version Alpha 1.0
 */
/////////////////////////////////////////////////////////////////////
public class Player extends GameEntity
{
	private String hero;
   private double damageAmp;
   private int x, y;
   private int currentGrid;
   
   private Juggernaut juggernaut;// = new Juggernaut();
   private Pyromancer pyromancer;// = new Pyromancer();
   private Marksman marksman;// = new Marksman();
   
	private MenuUI menuUI = new MenuUI();
	//-------------------------------------------------------------------
	public Player()
	{
	   super.setEntity("player");
	   super.setName(menuUI.setName());
	   setHero(menuUI.setHero());
	   super.setHealth(100);
	   
	   currentGrid = 1;
	}
	//-------------------------------------------------------------------
   public void setHero(String hero)
   {
      this.hero = hero;
      
      switch(hero)
      {
         case "marksman":
            BattleEntity marksman = new Marksman();
            
            break;
         case "pyromancer":
            BattleEntity pyromancer = new Pyromancer();
            
            break;
         case "juggernaut":
            BattleEntity juggernaut = new Juggernaut();
            
      }
   }
   //-------------------------------------------------------------------
   public String getHero()
   {
      return hero;
   }
	//-------------------------------------------------------------------
   public void setLocation(int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   //-------------------------------------------------------------------
   public int getX()
   {
      return x;
   }
   //-------------------------------------------------------------------
   public int getY()
   {
      return y;
   }
   //-------------------------------------------------------------------
   public void setCurrentGrid(int currentGrid)
   {
      this.currentGrid = currentGrid;
   }
   public int getCurrentGrid()
   {
      return currentGrid;
   }
}
/////////////////////////////////////////////////////////////////////

