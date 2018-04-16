package project_1;
/////////////////////////////////////////////////////////////////////
public abstract class Grid 
{
   private GameEntity[][] grid = new GameEntity[15][15];
   
   private GameEntity leftCorner;
   private GameEntity rightCorner;
   private GameEntity empty;
   //-------------------------------------------------------------------
   public void setEntities()
   {
       leftCorner = new LeftCorner();
       rightCorner = new RightCorner();
       empty = new Empty();
   }
 //-------------------------------------------------------------------
   public void setEntity(GameEntity entity, int x, int y)
   {
      grid[x][y] = entity;
   }
   //-------------------------------------------------------------------
   public void setPlayerLocation(int x, int y, GameEntity player)
   {
      grid[x][y] = player;
      player.setLocation(x, y);
   }
   //-------------------------------------------------------------------
   public void setLeftCornerLocation()
   {
      grid[0][0] = leftCorner;
      grid[0][14] = leftCorner;
   }
   //-------------------------------------------------------------------
   public void setRightCornerLocation()
   {
      grid[14][0] = rightCorner;
      grid[14][14] = rightCorner;
   }
   //-------------------------------------------------------------------
   public void setEmptyLocation()
   {
      for (int x = 0; x < 15; x++)
      {
         for (int y = 0; y < 15; y++)
         {
            if (grid[x][y] == null)
               grid[x][y] = empty;
         }
      }
   }
   //-------------------------------------------------------------------
   public void setEmptyLocation(int x, int y)
   {
      grid[x][y] = empty;
   }
   //-------------------------------------------------------------------
   public GameEntity getEmpty()
   {
      return empty;
   }
   //-------------------------------------------------------------------
   public GameEntity getLeftCorner()
   {
      return leftCorner;
   }
   //-------------------------------------------------------------------
   public GameEntity getRightCorner()
   {
      return rightCorner;
   }
   //-------------------------------------------------------------------
   public GameEntity getEntity(int x, int y)
   {
      return grid[x][y];
   }
   //-------------------------------------------------------------------
   public void printGrid()
   {
      for(int y = 14; y > -1; y--)
      {
         for(int x = 0; x < 15; x++)
         {
            switch(getEntity(x, y).getEntity())
            {
            case "player": 
               System.out.print("(- -)");
               break;
            case "grass":
               System.out.print("^^ ^^");
               break;
            case "empty":
               System.out.print("     ");
               break;
            case "rock":
               System.out.print("(/ /)");
               break;
            case "leftBorder":
               System.out.print("   ‡ ");
               break;
            case "rightBorder":
               System.out.print(" ‡   ");
               break;
            case "leftBridge":
               System.out.print("‡==‡ ");
               break;
            case "rightBridge":
               System.out.print(" ‡==‡");
               break;
            case "bottomTopBorder":
               System.out.print("=====");
               break;
            case "leftCorner":
               System.out.print("   ‡=");
               break;
            case "rightCorner":
               System.out.print("=‡   ");
            } 
         }
         System.out.println();
      }
   }
   //-------------------------------------------------------------------
   public abstract void setLocations();
   public abstract void setRockLocation();
   public abstract void setGrassLocation();
   public abstract void setGrassLocation(int x, int y);
   public abstract void setLeftBorderLocation();
   public abstract void setRightBorderLocation();
   public abstract void setBottomTopBorderLocation();
   public abstract GameEntity getRock();
   public abstract GameEntity getGrass();
   public abstract GameEntity getLeftBorder();
   public abstract GameEntity getRightBorder();
   public abstract GameEntity getBottomTopBorder();
   public abstract boolean move(boolean wasOnGrass, GameEntity player);
   //-------------------------------------------------------------------
}
/////////////////////////////////////////////////////////////////////