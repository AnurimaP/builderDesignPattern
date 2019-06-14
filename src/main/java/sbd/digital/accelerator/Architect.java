package sbd.digital.accelerator;

/**
 * This is Director
 */

public class Architect {
    private HouseBuilder houseBuilder;

    public Architect(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse(){
        this.houseBuilder.buildLevels();
        this.houseBuilder.buildBedRooms();
        this.houseBuilder.buildKitchen();
        this.houseBuilder.buildLivingRoom();
    }
    public House getHouse(){
        return this.houseBuilder.getHouse();
    }





}
