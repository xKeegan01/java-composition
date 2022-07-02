package homework11;

public class CPU {
    private String make;
    private String model;
    private double frequency;
    private int core;
    private int cache;
    // Finish Class - Add constructor, Getters, Setters


    public CPU(String make, String model, double frequency, int core, int cache) {
        this.make = make;
        this.model = model;
        this.frequency = frequency;
        this.core = core;
        this.cache = cache;
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

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }
}
