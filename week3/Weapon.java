public class Weapon {

    String type;
    int damage;
    float weight;
    String rarity;
    String description;
    boolean isEternal;

    public void showAllAttributes(){
        System.out.println("Type: " + type);
        System.out.println("Damage: " + damage);
        System.out.println("Weight: " + weight);
        System.out.println("Rarity: " + rarity);
        System.out.println("Eternal: " + isEternal);
        System.out.println(description);
    }
    
}
