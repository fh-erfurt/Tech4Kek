package de.tech4kek.warehouse;
import de.tech4kek.computer.*;

public class Warehouse {
    //Constructor
    public Warehouse(){
        firstComputer = new Computer();
        firstComputer.setM_NextComputer(null);
        firstComputer.setM_ManufacturerOfComputer(null);
        firstComputer.setM_ComputerDetails(new Computerdetails());
        firstComputer.getM_ComputerDetails().setM_Description("Anchor");
    }
    //Variable
    Computer firstComputer;

    //Set/Get
    public void setFirstComputer(Computer firstComputer) {
        this.firstComputer = firstComputer;
    }

    public Computer getFirstComputer() {
        return firstComputer;
    }
}
