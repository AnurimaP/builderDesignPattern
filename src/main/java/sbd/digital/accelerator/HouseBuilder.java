package sbd.digital.accelerator;

/**
 * This is Builder
 */
public interface HouseBuilder {
    public void buildLevels();
    public void buildBedRooms();
    public void buildKitchen();
    public void buildLivingRoom();
    public House getHouse();
}
