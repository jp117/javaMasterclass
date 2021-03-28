package academy.learning;

import java.util.ArrayList;
import java.util.List;

public class Monster implements  ISaveable{

    private String name;
    private String type;
    private int armorValue;
    private int health;

    public Monster(String name, String type, int armorValue, int health) {
        this.name = name;
        this.type = type;
        this.armorValue = armorValue;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getArmorValue() {
        return armorValue;
    }

    public void setArmorValue(int armorValue) {
        this.armorValue = armorValue;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", armorValue=" + armorValue +
                ", health=" + health +
                '}';
    }

    @Override
    public List<String> save() {

        List<String> save = new ArrayList<String>();
        save.add(0, name);
        save.add(1, type);
        save.add(2, "" + this.armorValue);
        save.add(3, "" + this.health);
        return save;
    }

    @Override
    public void read(List<String> savedValues) {

        if (savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.type = savedValues.get(1);
            this.armorValue = Integer.parseInt(savedValues.get(2));
            this.health = Integer.parseInt(savedValues.get(3));
        }

    }
}
