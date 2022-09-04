public class App {
    public static void main(String[] args) {

         // Character Class
         Character knight = new Character();

         knight.strength = 10;
         knight.agility = 5;
         knight.intelligence = 0;
         knight.name = "Chen";
         knight.sayMyName();

         knight.seeAllAttributes();
 
         Character mage = new Character();
 
         mage.strength = 0;
         mage.agility = 5;
         mage.intelligence = 10;
         mage.name = "Akasha";
         mage.sayMyName();

         mage.seeAllAttributes();
 
         Character thief = new Character();
 
         thief.strength = 5;
         thief.agility = 10;
         thief.intelligence = 0;
         thief.name = "Gondar";
         thief.sayMyName();

         thief.seeAllAttributes();

         Character healer = new Character();

         healer.strength = 10;
         healer.agility = 9;
         healer.intelligence = 7;
         healer.name = "Paula";
         healer.sayMyName();

         healer.seeAllAttributes();
 
         // Enemy Class
         Enemy boss = new Enemy();
 
         boss.damage = 50;
         boss.health = 500;
         boss.armor = 100;
         boss.hasMagicImmunity = true;
         boss.name = "Roshan";
         boss.enemyDialogue();
 
         Enemy skeleton = new Enemy();
 
         skeleton.damage = 5;
         skeleton.health = 10;
         skeleton.armor = 5;
         skeleton.hasMagicImmunity = false;
         skeleton.name = "Common Skeleton Warrior";
         skeleton.enemyDialogue();
 
         Enemy dragon = new Enemy();
 
         dragon.damage = 40;
         dragon.health = 400;
         dragon.armor = 75;
         dragon.hasMagicImmunity = false;
         dragon.name = "Ancient Wyvern";
         dragon.enemyDialogue();

         Enemy dinosaur = new Enemy();

         dinosaur.damage = 45;
         dinosaur.health = 350;
         dinosaur.armor = 100;
         dinosaur.hasMagicImmunity = false;
         dinosaur.name = "Tyrex";
         dinosaur.enemyDialogue();

         // Weapon Class
         Weapon gun = new Weapon();

         gun.type = "Shotgun";
         gun.damage = 200;
         gun.weight = 3.0f;
         gun.rarity = "Epic";
         gun.description = "An epic gun owned by Paula";
         gun.isEternal = false;

         gun.showAllAttributes();

         Weapon knife = new Weapon();

         knife.type = "Melee";
         knife.damage = 300;
         knife.weight = 1.0f;
         knife.rarity = "Legendary";
         knife.description = "A legendary gun owned by Chen";
         knife.isEternal = true;

         knife.showAllAttributes();

         // Gear Class
         Gear helmet = new Gear();

         helmet.gear = "Paula's Helmet";
         helmet.rarity = "Common";
         helmet.weight = 2.5f;
         helmet.description = "A common helmet owned by Paula";

         helmet.seeAllAttributes();
         

         Gear armor = new Gear();

         armor.gear = "Chen's Body Armor";
         armor.rarity = "Rare";
         armor.weight = 7.0f;
         armor.description = "A rare helmet owned by Chen";

         armor.seeAllAttributes();
        




     }
 }
