package academy.learning;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        this.model = model;
        String validModel = model.toLowerCase();
        if(validModel.equals("porsche") || validModel.equals("holden")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

    public void setWheels(int wheels){
        this.wheels = wheels;
    }

    public void setEngine(String engine){
        this.engine = engine;
    }

    public void setColor(String color){
        this.color = color;
    }
}
