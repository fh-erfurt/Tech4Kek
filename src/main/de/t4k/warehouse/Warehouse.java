package main.de.t4k.warehouse;
import main.de.t4k.computer.*;

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
