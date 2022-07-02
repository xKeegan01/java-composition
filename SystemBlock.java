package homework11;

public class SystemBlock {
    private PowerSupply powerSupply;
    private Disk disk;
    private GraphicCard graphicCard;
    private MotherBoard motherBoard;

    public SystemBlock(PowerSupply powerSupply, Disk disk, GraphicCard graphicCard, MotherBoard motherBoard) {
        this.powerSupply = powerSupply;
        this.disk = disk;
        this.graphicCard = graphicCard;
        this.motherBoard = motherBoard;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }
}
