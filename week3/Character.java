public class Character {
    // Character attributes
    int strength;
    int agility;
    int intelligence;
    String name;

    // Character method
    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }

    public void seeAllAttributes(){
        System.out.println("Strength:" + strength);
        System.out.println("Agility:" + agility);
        System.out.println("Intelligence:" + intelligence);
    }
}
