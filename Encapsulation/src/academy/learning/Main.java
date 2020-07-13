package academy.learning;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "John";
//        player.health = 100;
//        player.weapon = "Sword";
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 91;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        //the problem with code like this is that you will not be guaranteeing that classes are implemented properly and it will make maintenance a pain in the butt especially when working on larger projects
        EnhancedPlayer player = new EnhancedPlayer("John", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }


}
