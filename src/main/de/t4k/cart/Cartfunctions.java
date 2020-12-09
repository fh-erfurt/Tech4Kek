package t4k.cart;

import t4k.computer.Computer;

public class Cartfunctions {

    public static boolean addElement(Cart TheCart, Computer TheComputer, int number){ //Geht, getestet
        //Übergibt den Knoten von Warehouse des ersten PC
        Element Anchor = TheCart.getM_firstElement();

        //Scroolt durch die Liste bis zum letzten Element
        while (Anchor.getM_nextElement() != null){
            Anchor = Anchor.getM_nextElement();
            if(Anchor.getM_Computer() == TheComputer){
                return false; //False wenn PC schon in der Liste ist
            };
        }
        //Macht neuen PC und setzt nachfolger auf null
        Element NewElement = new Element();
        NewElement.setM_nextElement(null);

        NewElement.setM_Computer(TheComputer);
        NewElement.setM_CountOfComputers(number);

        TheCart.setM_ElementCount(TheCart.getM_ElementCount()+1);

        Anchor.setM_nextElement(NewElement);
        return true;
    };

    public static boolean delElement(Cart TheCart, int Element_Number){ //Geht, getestet
        Element Anchor = TheCart.getM_firstElement();
        Element Placeholder = TheCart.getM_firstElement();;

        if(Element_Number > TheCart.getM_ElementCount() || Element_Number <= 0) {
            return false; //Object nicht vorhanden
        }

        for (int i = 0; i < Element_Number; ++i){
            Placeholder = Anchor;
            Anchor = Anchor.getM_nextElement();
        }

        Placeholder.setM_nextElement(Anchor.getM_nextElement());
        Anchor = null;
        TheCart.setM_ElementCount(TheCart.getM_ElementCount()-1);

        return true;
    }

    public static Element searchElement(Cart TheCart, int ItemID){ //Sucht nach itemID kann man aber auch leicht in was anderes ändern //Geht, getestet
        Element Anchor = TheCart.getM_firstElement();
        Element Placeholder = null;
        Boolean isFound = false;

        while (Anchor.getM_nextElement() != null){
            Anchor = Anchor.getM_nextElement();

            if(Anchor.getM_Computer().getM_ItemId() == ItemID){
                Placeholder = Anchor;
                isFound = true;
                System.out.println("Element Gefunden");
                return Placeholder;
            }
        }

        if(!isFound){ //nö ist nicht immer true aber ok xD (habe getestet)
            System.out.println("Element nicht Gefunden");
        }

        return null;

    }


}

