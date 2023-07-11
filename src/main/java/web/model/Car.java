package web.model;

public class Car {

    private String model;
    private String color;
    private int enginePower;

    public Car(String model, String color, int enginePower) {
        this.model = model;
        this.color = color;
        this.enginePower = enginePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", enginePower=" + enginePower +
                '}';
    }
}
