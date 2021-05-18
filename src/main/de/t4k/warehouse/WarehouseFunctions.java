package main.de.t4k.warehouse;
import main.de.t4k.common.Address;
import main.de.t4k.computer.*;



public class WarehouseFunctions {
    //static so you can use the function, without creating an object
    public static Computer addComputer(Warehouse TheWarehouse ,String description, int itemid, String detailname, double price, double cpuclock, int cpucoreamount, String cpuname,
                                       int threadcount, String gpuname, double gpuclock, String ramname, int ramsize, int vramamount, String manPhoneNum, String agent, String agentName, int zip, String street, String houseNr, String country, String city){
        //transfers node of the first computer from warehouse
        Computer Anchor = TheWarehouse.getFirstComputer();

        //moves trough all elements
        while (Anchor.getM_NextComputer() != null){
            Anchor = Anchor.getM_NextComputer();
        }

        //creates new pc and sets successor null
        Computer NewPC = new Computer();
        NewPC.setM_NextComputer(null);

        //insert details
        NewPC.setM_ManufacturerOfComputer(new Manufacturer());
        NewPC.getM_ManufacturerOfComputer().setM_AddressOfMan(new Address());
        NewPC.setM_ComputerDetails(new Computerdetails());
        NewPC.setM_ItemId(itemid);


        NewPC.getM_ManufacturerOfComputer().setM_ManPhoneNumber(manPhoneNum);
        NewPC.getM_ManufacturerOfComputer().setM_Agent(agent);
        NewPC.getM_ManufacturerOfComputer().setM_ManName(agentName);

        NewPC.getM_ManufacturerOfComputer().getM_AddressOfMan().setM_ZIP(zip);
        NewPC.getM_ManufacturerOfComputer().getM_AddressOfMan().setM_Street(street);
        NewPC.getM_ManufacturerOfComputer().getM_AddressOfMan().setM_HouseNr(houseNr);
        NewPC.getM_ManufacturerOfComputer().getM_AddressOfMan().setM_Country(country);
        NewPC.getM_ManufacturerOfComputer().getM_AddressOfMan().setM_City(city);

        NewPC.getM_ComputerDetails().setM_Price(price);
        NewPC.getM_ComputerDetails().setM_DetailName(detailname);
        NewPC.getM_ComputerDetails().setM_Description(description);
        NewPC.getM_ComputerDetails().setM_CpuClock(cpuclock);
        NewPC.getM_ComputerDetails().setM_CpuCoreAmount(cpucoreamount);
        NewPC.getM_ComputerDetails().setM_CpuName(cpuname);
        NewPC.getM_ComputerDetails().setM_CpuThreadAmount(threadcount);
        NewPC.getM_ComputerDetails().setM_Gpu(gpuname);
        NewPC.getM_ComputerDetails().setM_GpuClock(gpuclock);
        NewPC.getM_ComputerDetails().setM_Ram(ramname);
        NewPC.getM_ComputerDetails().setM_RamSize(ramsize);
        NewPC.getM_ComputerDetails().setM_VramAmount(vramamount);

        Anchor.setM_NextComputer(NewPC);
        return NewPC;
    };

    public static Computer delComputer(Warehouse TheWarehouse, int ID){
        Computer Anchor = TheWarehouse.getFirstComputer();
        Computer Placeholder = null;
        Computer isDeleted = null;

        while (Anchor.getM_NextComputer() != null){

            if(Anchor.getM_NextComputer().getM_ItemId() == ID){
                isDeleted = Anchor.getM_NextComputer();
                Placeholder = Anchor.getM_NextComputer().getM_NextComputer();
                Anchor.setM_NextComputer(Placeholder);
                System.out.println("Element Entfernt");
                break;
            }
            Anchor = Anchor.getM_NextComputer();
        }

        if(isDeleted == null){
            System.out.println("Element nicht vorhanden");
        }

    return isDeleted;
    };

    public static Computer searchComputer(Warehouse TheWarehouse, int id){  //search for id
        Computer Anchor = TheWarehouse.getFirstComputer();
        Computer Placeholder = null;

        while (Anchor.getM_NextComputer() != null){

            if(Anchor.getM_ItemId() == id){
                Placeholder = Anchor;
                System.out.println("Element Gefunden");
                break;
            }
            Anchor = Anchor.getM_NextComputer();
        }

        if(Placeholder == null){
            System.out.println("Element nicht vorhanden");
        }

        return Placeholder;
    }
}
