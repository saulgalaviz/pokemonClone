package project_1;

import java.util.Random;

public class Enemy extends GameEntity
{
   private Random random = new Random();
   private Skeleton skeleton;
   private Goblin goblin;
   private Zombie zombie;
   
   public Enemy(GameEntity player)
   {
      switch(player.getCurrentGrid())
      {
         case 2:
            super.setHealth(50);
            break;
         case 3:
            super.setHealth(200);
            break;
         case 4:
            super.setHealth(500);
      }
   
      int enemySeed = random.nextInt(3);
      
      switch (enemySeed)
      {
         case 0:
            super.setName("Skeleton");
            skeleton = new Skeleton();
            //skeleton();
            break;
         case 1:
            super.setName("Goblin");
            goblin = new Goblin();
            //goblin();
            break;
         case 2:
            super.setName("Zombie");
            zombie = new Zombie();
            //zombie();
      }
   }
   
//   public void skeleton()
//   {
//      super.setHealth(50);
//   }
//   
//   public void goblin()
//   {
//      super.setHealth(30);
//   }
//   
//   public void zombie()
//   {
//      super.setHealth(40);
//   }
}
