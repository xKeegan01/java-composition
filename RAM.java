package homework11;

public class RAM {
    private String make;
    private String model;
    private String type;
    private int size;
    // Finish Class - Add constructor, Getters, Setters


    public RAM(String make, String model, String type, int size) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.size = size;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
