package homework11;

public class Computer {
    private Mouse mouse;
    private Keyboard keyboard;
    private Monitor monitor;
    private SystemBlock systemBlock;

    public Computer(Mouse mouse, Keyboard keyboard, Monitor monitor, SystemBlock systemBlock) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.systemBlock = systemBlock;


    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }
}
