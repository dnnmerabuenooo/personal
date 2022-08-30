public class Weapon {

    // Properties/Attributes
    String name;
    int damage;
    float weight;
    String rarity;
    String description;
    boolean isEternal;

    // Method
    public void showAllAttributes(){
        System.out.println("Name:" + name);
        System.out.println("Damage:" + damage);
        System.out.println("Weight:" + weight);
        System.out.println("Rarity:" + rarity);
        System.out.println("Eternal:" + isEternal);
     }

     public void displayweaponDescription(){
        System.out.println("Description:" + description);
     }
    
}
