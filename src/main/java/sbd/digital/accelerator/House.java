package sbd.digital.accelerator;

/**
 * Hello world!
 *
 */

/**
 * This is Product
 */
class House implements HousePlan{
    private int numLevels;
    private int numBedRooms;
    private String kitchen;
    private String livingRoom;

    @Override
    public void setNoOfLevels(int numLevels){
        this.numLevels = numLevels;
    }

    @Override
    public void setNoOfBedrooms(int numBedRooms) {
        this.numBedRooms = numBedRooms;
    }

    @Override
    public void setKitchen(String kitchen){
        this.kitchen = kitchen;
    }

    @Override
    public void setLivingRoom(String livingRoom){
        this.livingRoom = livingRoom;
    }
}




