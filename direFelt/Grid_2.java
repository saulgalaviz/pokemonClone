package project_1;
/////////////////////////////////////////////////////////////////////
public class Grid_2 extends Grid
{
   private GameEntity grass;
   private GameEntity rock;
   private GameEntity leftBorder;
   private GameEntity rightBorder;
   private GameEntity leftBridge;
   private GameEntity rightBridge;
   private GameEntity bottomTopBorder;
   
   private GameUI ui = new GameUI();
   //-------------------------------------------------------------------
   public Grid_2()
   {
      grass = new GrassField();
      rock = new Rock();
      leftBorder = new LeftBorder();
      rightBorder = new RightBorder();
      leftBridge = new LeftBridge();
      rightBridge = new RightBridge();
      bottomTopBorder = new BottomTopBorder();
      super.setEntities();
      
      setLocations();
   }
   //-------------------------------------------------------------------
   public void setLocations()
   {
      setGrassLocation();
      setRockLocation();
      setBottomTopBorderLocation();
      setLeftBorderLocation();
      setRightBorderLocation();
      setLeftBridgeLocation();
      setRightBridgeLocation();
      super.setLeftCornerLocation();
      super.setRightCornerLocation();
      super.setEmptyLocation();
   }
   //-------------------------------------------------------------------
   public void setRockLocation()
   {
      
      
   }
   //-------------------------------------------------------------------
   public void setGrassLocation()
   {
      super.setEntity(grass, 5, 5);
      grass.setLocation(5, 5);
   }
   //-------------------------------------------------------------------
   public void setGrassLocation(int x, int y)
   {
      super.setEntity(grass, x, y);
   }
   //-------------------------------------------------------------------
   public void setLeftBorderLocation()
   {
      for (int y = 0; y < 14; y++) //Borders
      {
         super.setEntity(leftBorder, 0, y);
         leftBorder.setLocation(0, y);
      }
   }
   
   public void setRightBorderLocation()
   {
      for (int y = 0; y < 14; y++) //Borders
      {
         if (y!= 5)
         {
            super.setEntity(rightBorder, 14, y);
            rightBorder.setLocation(14, y);
         }
      }
   }
   public void setLeftBridgeLocation()
   {
      
   }
   public void setRightBridgeLocation()
   {
      super.setEntity(rightBridge, 14, 6);
      super.setEntity(rightBridge, 14, 4);
   }
   //-------------------------------------------------------------------
   public void setBottomTopBorderLocation()
   {
      for (int x = 0; x < 15; x++) //Borders
      {
         super.setEntity(bottomTopBorder, x, 0);
         bottomTopBorder.setLocation(x, 0);
         
         super.setEntity(bottomTopBorder, x, 14);
         bottomTopBorder.setLocation(x,14);
      }
   }
   //-------------------------------------------------------------------
   public GameEntity getRock()
   {
      return rock;
   }
   //-------------------------------------------------------------------
   public GameEntity getGrass()
   {
      return grass;
   }
   //-------------------------------------------------------------------
   public GameEntity getLeftBorder()
   {
      return leftBorder;
   }
   public GameEntity getRightBorder()
   {
      return rightBorder;
   }
   //-------------------------------------------------------------------
   public GameEntity getBottomTopBorder()
   {
      return bottomTopBorder;
   }
   //-------------------------------------------------------------------
   public boolean move(boolean wasOnGrass, GameEntity player)
   {
      int playerX = player.getX();
      int playerY = player.getY();
      boolean canMove = true;
      boolean onGrass = false;
      
      switch (ui.move())
      {
         case "w": //Move Player Up
            for (int counter = 0; counter < 75; counter++)
            {
               if (playerX == getRock().getX(counter) && (playerY + 1) == getRock().getY(counter))
               {
                  ui.rockAhead();
                  canMove = false;
                  break;
               }
               
               else if (((playerX == getLeftBorder().getX(counter)) && ((playerY + 1) == getLeftBorder().getY(counter)) || (playerX == getRightBorder().getX(counter)) && (playerY + 1) == getRightBorder().getY(counter)) || (playerX == getBottomTopBorder().getX(counter) && (playerY + 1) == getBottomTopBorder().getY(counter)))
               {
                  ui.wallAhead();
                  canMove = false;
                  break;
               }
               
               else if (playerX == getGrass().getX(counter) && (playerY + 1) == getGrass().getY(counter))
               {
                  onGrass = true;
                  break;
               }
            }
            
            if(canMove)
            {
               setPlayerLocation(playerX, playerY + 1, player);
               
               player.setLocation(playerX, playerY + 1);
               
               if(wasOnGrass)
                  setGrassLocation(playerX, playerY);
               
               else if (!wasOnGrass)
                  setEmptyLocation(playerX, playerY);
            }
            break;
            
         case "a": //Move Player Left
            for (int counter = 0; counter < 75; counter++)
            {
               if ((playerX - 1) == getRock().getX(counter) && playerY == getRock().getY(counter))
               {
                  ui.rockAhead();
                  canMove = false;
                  break;
               }
               
               else if ((((playerX - 1) == getLeftBorder().getX(counter)) && (playerY == getLeftBorder().getY(counter)) || ((playerX - 1) == getRightBorder().getX(counter)) && playerY == getRightBorder().getY(counter)) || ((playerX - 1) == getBottomTopBorder().getX(counter) && playerY == getBottomTopBorder().getY(counter)))
               {
                  ui.wallAhead();
                  canMove = false;
                  break;
               }
               
               else if ((playerX - 1) == getGrass().getX(counter) && playerY == getGrass().getY(counter))
               {
                  onGrass = true;
                  break;
               }
            }
            
            if (canMove)
            {
               setPlayerLocation(playerX - 1, playerY, player);
               
               player.setLocation(playerX - 1, playerY);
               
               if(wasOnGrass)
                  setGrassLocation(playerX, playerY);
               
               else if (!wasOnGrass)
                  setEmptyLocation(playerX, playerY);
            }
            break;
            
         case "s": //Move player Down
            for (int counter = 0; counter < 75; counter++)
            {
               if (playerX == getRock().getX(counter) && (playerY - 1) == getRock().getY(counter))
               {
                  ui.rockAhead();
                  canMove = false;
                  break;
               }
               
               else if (((playerX == getLeftBorder().getX(counter)) && ((playerY - 1) == getLeftBorder().getY(counter)) || (playerX == getRightBorder().getX(counter)) && (playerY - 1) == getRightBorder().getY(counter)) || (playerX == getBottomTopBorder().getX(counter) && (playerY - 1) == getBottomTopBorder().getY(counter)))
               {
                  ui.wallAhead();
                  canMove = false;
                  break;
               }
               
               else if (playerX == getGrass().getX(counter) && (playerY - 1) == getGrass().getY(counter))
               {
                  onGrass = true;
                  break;
               }
            }
            
            if (canMove)
            {
               setPlayerLocation(playerX, playerY - 1, player);
               
               player.setLocation(playerX, playerY - 1);
               
               if(wasOnGrass)
                  setGrassLocation(playerX, playerY);
               
               else if (!wasOnGrass)
                  setEmptyLocation(playerX, playerY);
            }
            break;
            
         case "d": //Move Player Right
            for (int counter = 0; counter < 75; counter++)
            {
               if ((playerX + 1) == getRock().getX(counter) && playerY == getRock().getY(counter))
               {
                  ui.rockAhead();
                  canMove = false;
                  break;
               }
               
               else if ((((playerX + 1) == getLeftBorder().getX(counter)) && (playerY == getLeftBorder().getY(counter)) || ((playerX + 1) == getRightBorder().getX(counter)) && playerY == getRightBorder().getY(counter)) || ((playerX + 1) == getBottomTopBorder().getX(counter) && playerY == getBottomTopBorder().getY(counter)))
               {
                  ui.wallAhead();
                  canMove = false;
                  break;
               }
               
               else if ((playerX + 1) == getGrass().getX(counter) && playerY == getGrass().getY(counter))
               {
                  onGrass = true;
                  break;
               }
            }
            
            if(playerX == 14 && playerY == 5)
            {
               canMove = false;
               player.setCurrentGrid(1);
               player.setLocation(0, 5);
            }
            
            if (canMove)
            {
               setPlayerLocation(playerX + 1, playerY, player);
               
               player.setLocation(playerX + 1, playerY);
               
               if(wasOnGrass)
                  setGrassLocation(playerX, playerY);
               
               else if (!wasOnGrass)
                  setEmptyLocation(playerX, playerY);
            }
      }
      
      return onGrass;
   }
   //-------------------------------------------------------------------
}
/////////////////////////////////////////////////////////////////////