package t4k.warehouse;
import t4k.computer.*;

public class WarehouseFunctions {
    //Static damit man kein Objekt davon machen muss sondern einfach die Funktionen nutzen kann
    public static void addComputer(Warehouse TheWarehouse, String test, int id){ //Alle übergaben für zbs description fehlen noch
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
        NewPC.setM_ComputerDetails(new Computerdetails());
        NewPC.getM_ComputerDetails().setM_Description(test);
        NewPC.setM_ItemId(id);

        Anchor.setM_NextComputer(NewPC);
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

    public static Computer searchComputer(Warehouse TheWarehouse, int id){ //Sucht nach itemID kann man aber auch leicht in was anderes ändern
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
