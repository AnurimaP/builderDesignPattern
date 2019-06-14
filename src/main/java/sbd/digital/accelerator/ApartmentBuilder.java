package sbd.digital.accelerator;

/**
 * This is concrete Builder
 */

public class ApartmentBuilder implements HouseBuilder{

    private House house;

    public ApartmentBuilder(){
        this.house = new House();
    }

    @Override
    public void buildLevels(){
        house.setNoOfLevels(1);
    }

    @Override
    public void buildBedRooms(){
        house.setNoOfBedrooms(2);
    }

    @Override
    public void buildLivingRoom(){
        house.setLivingRoom("apartmentLivingRoom");
    }

    @Override
    public void buildKitchen(){
        house.setKitchen("apartmentKitchen");
    }

    @Override
    public House getHouse(){
        System.out.println("Apartment constructed");
        return this.house;
    }


}
