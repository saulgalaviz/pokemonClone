package project_1;
import java.util.Random;
/////////////////////////////////////////////////////////////////////
public class GameLogic 
{
   private Grid_1 grid_1;
   private Grid_2 grid_2;
   private Grid_3 grid_3;
  // private GameUI ui = new GameUI();
   private Random random = new Random();
   private GameEntity player;
   private GameEntity enemy;
   private Battlefield battlefield;
   //-------------------------------------------------------------------
   public void play()
   {
      boolean wasOnGrass = false;
      
      battlefield = new Battlefield();
      player = new Player();
      
      grid_1 = new Grid_1();
      player.setLocation(7, 3);
      grid_1.setEntity(player, 7, 3);
      
      grid_2 = new Grid_2();
      grid_3 = new Grid_3();
      
      while (player.getHealth() > 0)
      {
         switch (player.getCurrentGrid())
         {
            case 1:
               grid_1.setPlayerLocation(player.getX(), player.getY(), player);
               grid_1.printGrid();
               
               wasOnGrass = grid_1.move(wasOnGrass, player);
               
               if (wasOnGrass)
                  encounterEnemy();
               
               break;
               
            case 2:
               grid_2.setPlayerLocation(player.getX(), player.getY(), player);
               grid_2.printGrid();
               
               wasOnGrass = grid_2.move(wasOnGrass, player);
               
               if (wasOnGrass)
                  encounterEnemy();
            }
         }
   } 
   //-------------------------------------------------------------------
   public void encounterEnemy()
   {
      int encounterEnemy = random.nextInt(100);
      
      if (encounterEnemy < 100)//15% to encounter an enemy in the grass. (change to 15 from 100)
      {
         enemy = new Enemy(player);
         battlefield.battle(player, enemy);
      }
   }
}
/////////////////////////////////////////////////////////////////////