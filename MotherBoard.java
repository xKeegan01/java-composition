package homework11;

public class MotherBoard {
    private String make;
    private String model;
    private CPU cpu;
    private RAM memory;

    // Finish Class - Add constructor, Getters, Setters


    public MotherBoard(String make, String model, CPU cpu, RAM memory) {
        this.make = make;
        this.model = model;
        this.cpu = cpu;
        this.memory = memory;
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

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getMemory() {
        return memory;
    }

    public void setMemory(RAM memory) {
        this.memory = memory;
    }
}
