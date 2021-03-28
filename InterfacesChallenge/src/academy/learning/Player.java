package academy.learning;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{

    private String name;
    private String classType;
    private String armorType;
    private int health;

    public Player(String name, String classType, String armorType) {
        this.name = name;
        this.classType = classType;
        this.armorType = armorType;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", classType='" + classType + '\'' +
                ", armorType='" + armorType + '\'' +
                ", health=" + health +
                '}';
    }

    @Override
    public List<String> save() {
        List<String> save = new ArrayList<String>();

        // shouldve added each to its own index
        // save.add(this.toString());

        save.add(0, this.name);
        save.add(1, this.classType);
        save.add(2, this.armorType);
        save.add(3, "" + this.health);
        return save;
    }

    @Override
    public void read(List<String> savedValues) {

        if(savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.classType = savedValues.get(1);
            this.armorType = savedValues.get(2);
            this.health = Integer.parseInt(savedValues.get(3));
        }

    }
}
