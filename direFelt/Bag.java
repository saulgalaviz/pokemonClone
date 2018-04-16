package project_1;

public class Bag
{
   private int items;
   private final String[] bag;
   private static final int MAX_CAPACITY = 16;
   
   public Bag()
   {
      items = 0;
      bag = new String[MAX_CAPACITY]; 
   }
   
   public int getAmountOfItems()
   {
      return items;
   }
   
   public void add(String newEntry)
   {
      
   }
   
   public String removeEntry()
   {
      return null;
   }
   
}
