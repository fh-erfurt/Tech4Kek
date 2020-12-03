package t4k.cart;

import t4k.cart.Cart;
import t4k.billing.Bill;
import t4k.computer.Computer;
import t4k.computer.Computerdetails;
import t4k.computer.Manufacturer;
import t4k.warehouse.Warehouse;

public class Cartfunctions {

    public static void addObjekt(Cart TheCart, Computer TheComputer, int number){
        //Übergibt den Knoten von Warehouse des ersten PC
        Object Anchor = TheCart.getM_firstObject();

        //Scroolt durch die Liste bis zum letzten PC
        while (Anchor.getM_nextObject() != null){
            Anchor = Anchor.getM_nextObject();
        }

        //Macht neuen PC und setzt nachfolger auf null
        Object NewObject = new Object();
        NewObject.setM_nextObject(null);

        NewObject.setM_Computer(TheComputer);
        NewObject.setM_CountOfComputers(number);

        Anchor.setM_nextObject(NewObject);
    };

    public static boolean delObjekt(Cart TheCart, int ItemID){ //NOCH NICHT FERTIG
        Object Anchor = TheCart.getM_firstObject();
        Object Placeholder = null;
        Boolean isDeleted = false;

        while (Anchor.getM_nextObject() != null){

            if(Anchor.getM_nextObject().getM_Computer().getM_ItemId() == ItemID){
                Placeholder = Anchor.getM_nextObject().getM_nextObject();
                Anchor.setM_nextObject(Placeholder);
                isDeleted = true;
                System.out.println("Element Entfernt");
                break;
            }
            Anchor = Anchor.getM_nextObject();
        }

        if(!isDeleted){
            System.out.println("Element nicht vorhanden");
        }

        return isDeleted;
    };

    public static Object searchObjekt(Cart TheCart, int ItemID){ //Sucht nach itemID kann man aber auch leicht in was anderes ändern
        Object Anchor = TheCart.getM_firstObject();
        Object Placeholder = null;
        Boolean isFound = false;

        while (Anchor.getM_nextObject() != null){

            if(Anchor.getM_Computer().getM_ItemId() == ItemID){
                Placeholder = Anchor;
                isFound = true;
                System.out.println("Element Gefunden");
                break;
            }
            Anchor = Anchor.getM_nextObject();
        }

        if(!isFound){
            System.out.println("Element nicht vorhanden");
        }

        return Placeholder;

    }


}

