package t4k.warehouse;
import t4k.common.Address;
import t4k.computer.*;
import t4k.cart.*;
import t4k.computer.*;

public class WarehouseFunctions {
    //Static damit man kein Objekt davon machen muss sondern einfach die Funktionen nutzen kann
    public static Computer addComputer(Warehouse TheWarehouse ,String description, int itemid, int stocknumber, String detailname, double price, double cpuclock, int cpucoreamount, String cpuname,
                                       int threadcount, String gpuname, double gpuclock, String ramname, int ramsize, int vramamount, String manPhoneNum, String agent, String agentName, int zip, String street, String houseNr, String country, String city){
        //Übergibt den Knoten von Warehouse des ersten PC
        Computer Anchor = TheWarehouse.getFirstComputer();

        //Scroolt durch die Liste bis zum letzten PC
        while (Anchor.getM_NextComputer() != null){
            Anchor = Anchor.getM_NextComputer();
        }

        //Macht neuen PC und setzt nachfolger auf null
        Computer NewPC = new Computer();
        NewPC.setM_NextComputer(null);

        //Füllt alle Details (muss noch fertig gemacht werden...)
        NewPC.setM_ManufacturerOfComputer(new Manufacturer());
        NewPC.getM_ManufacturerOfComputer().setM_AddressOfMan(new Address());
        NewPC.setM_ComputerDetails(new Computerdetails());
        NewPC.setM_ItemId(itemid);
        NewPC.setM_StockNumber(stocknumber);

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

    public static boolean delComputer(Warehouse TheWarehouse, int ID){ //NOCH NICHT FERTIG
        Computer Anchor = TheWarehouse.getFirstComputer();
        Computer Placeholder = null;
        Boolean isDeleted = false;

        while (Anchor.getM_NextComputer() != null){

            if(Anchor.getM_NextComputer().getM_ItemId() == ID){
                Placeholder = Anchor.getM_NextComputer().getM_NextComputer();
                Anchor.setM_NextComputer(Placeholder);
                isDeleted = true;
                System.out.println("Element Entfernt");
                break;
            }
            Anchor = Anchor.getM_NextComputer();
        }

        if(!isDeleted){
            System.out.println("Element nicht vorhanden");
        }

    return isDeleted;
    };

    public static Computer searchComputer(Warehouse TheWarehouse, int id){ //Sucht nach itemID kann man aber auch leicht in was anderes ändern bzw unterschiedliche machen
        Computer Anchor = TheWarehouse.getFirstComputer();
        Computer Placeholder = null;
        Boolean isFound = false;

        while (Anchor.getM_NextComputer() != null){

            if(Anchor.getM_ItemId() == id){
                Placeholder = Anchor;
                isFound = true;
                System.out.println("Element Gefunden");
                break;
            }
            Anchor = Anchor.getM_NextComputer();
        }

        if(!isFound){
            System.out.println("Element nicht vorhanden");
        }

        return Placeholder;

    }

    public static void changeStockNumber(int newStock, Computer ThePC) //Glaube die ist unnötig
    {
        ThePC.setM_StockNumber(newStock);
    }

}
