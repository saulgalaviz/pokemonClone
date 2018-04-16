package project_1;
/////////////////////////////////////////////////////////////////////
public class GameEntity 
{
   private String entity;
   private String name;
   private int health;
   private int[] x = new int[75];
   private int[] y = new int[75];
   //-------------------------------------------------------------------
   public void setEntity(String entity)
   {
      this.entity = entity;
   }
   //-------------------------------------------------------------------
   public String getEntity()
   {
      return entity;
   }
   //-------------------------------------------------------------------
   public void setName(String name)
   {
      this.name = name;
   }
   //-------------------------------------------------------------------
   public String getName()
   {
      return name;
   }
   //-------------------------------------------------------------------
   public void setHealth(int health)
   {
      this.health = health;
   }
   //-------------------------------------------------------------------
   public int getHealth()
   {
      return health;
   }
   //-------------------------------------------------------------------
   public void setToNull()
   {
      for (int counter = 0; counter < 75; counter++)
      {
         x[counter] = -1;
         y[counter] = -1;
      }
   }
   //-------------------------------------------------------------------
   public void setLocation(int x, int y)
   {
      for(int counter = 0; counter < 75; counter++)
      {
         if (this.x[counter] == -1 && this.y[counter] == -1) 
         {
            this.x[counter] = x;
            this.y[counter] = y;
            break;
         }
      }
   }
   public int getX(int counter)
   {
      return x[counter];
   }
   //-------------------------------------------------------------------
   public int getY(int counter)
   {
      return y[counter];
   }
   //------------------------------------------------------------------- To get overridden in the Player class 
   public int getX()
   {
      return 0;
   }
   public int getY()
   {
      return 0;
   }
   public void setCurrentGrid(int currentGrid)
   {
   }
   public int getCurrentGrid()
   {
      return 0;
   }
   //------------------------------------------------------------------- To get overridden in the Player class
}
/////////////////////////////////////////////////////////////////////