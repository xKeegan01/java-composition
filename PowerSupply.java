package homework11;

public class PowerSupply {
    private String make;
    private String model;
    private int wattage;
    // Finish Class - Add constructor, Getters, Setters


    public PowerSupply(String make, String model, int wattage) {
        this.make = make;
        this.model = model;
        this.wattage = wattage;
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

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }
}
