package homework11;

public class Mouse {
    private String make;
    private String model;
    private String movement;

    public Mouse(String make, String model, String movement) {
        this.make = make;
        this.model = model;
        this.movement = movement;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }
}
