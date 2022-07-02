package homework11;

public class Monitor {
    private String make;
    private String model;
    private int diagonal;
    private String displayType;

    // Finish Class - Add constructor, Getters, Setters


    public Monitor(String make, String model, int diagonal, String displayType) {
        this.make = make;
        this.model = model;
        this.diagonal = diagonal;
        this.displayType = displayType;
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

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }
}
