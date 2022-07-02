package homework11;

public class GraphicCard {
    private String make;
    private String model;
    private int memorySize;
    private GPU gpu;
    // Finish Class - Add constructor, Getters, Setters


    public GraphicCard(String make, String model, int memorySize, GPU gpu) {
        this.make = make;
        this.model = model;
        this.memorySize = memorySize;
        this.gpu = gpu;
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

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }
}
