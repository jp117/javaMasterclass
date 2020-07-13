package academy.learning;

import java.sql.SQLOutput;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player has died");
            // Reduce number of lives remaining
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
