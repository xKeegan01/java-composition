package homework11;

public class App {
    public static void main(String[] args) {
        // create computer 1
         Mouse mouse1 = new Mouse("Razer", "Basilisk v2", "Optical");
         Keyboard keyboard1 = new Keyboard("Razer", "Huntsman");
         Monitor monitor1 = new Monitor("Samsung", "Odyssey", 27, "WQHD");
         PowerSupply power1 = new PowerSupply("Corsair", "RM", 850);
         Disk disk1 = new Disk("Western digital", "WD Purple", 4, DiskType.SSD);
         GPU gpu1 = new GPU("nVidia", "GeForce RTX", 1785);
         GraphicCard graphicCard1 = new GraphicCard("ASUS TUF", "GeForce RTX 3070 Ti", 8, gpu1);
         CPU cpu1 = new CPU("Intel", "i9-11900k", 3.5, 8, 16);
         RAM ram1 = new RAM("Corsair", "Vengeance", "DDR4", 16);
         MotherBoard motherBoard1 = new MotherBoard("ASUS ROG", "Maximus Z690 Hero", cpu1, ram1);
         SystemBlock systemBlock1 = new SystemBlock(power1, disk1, graphicCard1, motherBoard1);

        // from computer 1 get CPU Frequency
        Computer computer1 = new Computer(mouse1, keyboard1, monitor1, systemBlock1 );
        Double getComp1Frequency = computer1.getSystemBlock().getMotherBoard().getCpu().getFrequency();
        System.out.println("Computer 1 CPU frequency: " + getComp1Frequency + "Hz");

        // create computer 2
        Mouse mouse2 = new Mouse("Razer", "Venom v3", "Optical");
        Keyboard keyboard2 = new Keyboard("Corsair", "K100");
        Monitor monitor2 = new Monitor("GIGABYTE", "G27Q", 27, "IPS");
        PowerSupply power2 = new PowerSupply("Seasonic", "PRIME", 1000);
        Disk disk2 = new Disk("Samsung", "QVO Series", 2, DiskType.SSD);
        GPU gpu2 = new GPU("nVidia", "GeForce RTX", 1785);
        GraphicCard graphicCard2 = new GraphicCard("GIGABYTE", "GeForce RTX 3070 Ti", 8, gpu2);
        CPU cpu2 = new CPU("AMD", "5950X", 3.4, 16, 64);
        RAM ram2 = new RAM("G.SKILL", "Trident", "DDR5", 32);
        MotherBoard motherBoard2 = new MotherBoard("MSI", "970A", cpu2, ram2);
        SystemBlock systemBlock2 = new SystemBlock(power2, disk2, graphicCard2, motherBoard2);
        // from computer 2 get RAM size;
        Computer computer2 = new Computer(mouse2, keyboard2, monitor2, systemBlock2);
        int getComp2RamSize = computer2.getSystemBlock().getMotherBoard().getMemory().getSize();
        System.out.println("Computer 2 RAM size: " + getComp2RamSize + "GB");
    }
}
