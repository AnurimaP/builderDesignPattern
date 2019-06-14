package sbd.digital.accelerator;
/**
This is concrete Builder
 **/

public class CottageBuilder implements HouseBuilder{

    private House house;

    public CottageBuilder(){
        this.house = new House();
    }

    @Override
    public void buildLevels(){
        house.setNoOfLevels(2);
    }

    @Override
    public void buildBedRooms(){
        house.setNoOfBedrooms(4);
    }

    @Override
    public void buildLivingRoom(){
        house.setLivingRoom("cottageLivingRoom");
    }

    @Override
    public void buildKitchen(){
        house.setKitchen("cottageKitchen");
    }

    @Override
    public House getHouse(){
        System.out.println("Cottage constructed");
        return this.house;
    }


}
