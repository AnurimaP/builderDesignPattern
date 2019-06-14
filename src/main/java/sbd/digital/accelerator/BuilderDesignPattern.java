package sbd.digital.accelerator;

public class BuilderDesignPattern {

    public static void main(String [] args){

        Architect architect1 = new Architect(new CottageBuilder());
        architect1.buildHouse();
        architect1.getHouse();
        Architect architect2 = new Architect(new ApartmentBuilder());
        architect2.buildHouse();
        architect2.getHouse();

    }
}
