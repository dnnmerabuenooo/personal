public class Gear {
      // Properties/Attributes
      String name;
      String rarity;
      float weight;
      String description;
  
      // Method
      public void seeAllAttributes(){
          System.out.println("Name:" + name);
          System.out.println("Rarity:" + rarity);
          System.out.println("Weight:" + weight);
       }
  
       public void displayGearDescription(){
          System.out.println("Description:" + description);
       }
}
