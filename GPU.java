package homework11;

public class GPU {
    private String make;
    private String model;
    private double frequency;
    // Finish Class - Add constructor, Getters, Setters


    public GPU(String make, String model, double frequency) {
        this.make = make;
        this.model = model;
        this.frequency = frequency;
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

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
