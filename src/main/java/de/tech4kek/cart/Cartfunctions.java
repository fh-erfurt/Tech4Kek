package de.tech4kek.cart;


import de.tech4kek.computer.Computer;

public class Cartfunctions {
 //number == How many PC's the customer wants to put in the Cart
    public static Element addElement(Cart TheCart, Computer TheComputer, int number) {
        //gives anchor node
        Element Anchor = TheCart.getFirstElement();

        if (TheComputer.getOnStock() < number)
        {
            System.out.println("Zu wenig Systeme vorhanden");
            return null;
        }

        //moves trough all elements
        while (Anchor.getNextElement() != null){
            Anchor = Anchor.getNextElement();
            if(Anchor.getComputer() == TheComputer){
                return null; //false if pc is already existing
            };
        }
        //creates new pc and sets successor null
        Element NewElement = new Element();
        NewElement.setNextElement(null);
        TheComputer.setOnStock(TheComputer.getOnStock()-number);

        NewElement.setComputer(TheComputer);
        NewElement.setM_CountOfComputers(number);

        TheCart.setM_ElementCount(TheCart.getM_ElementCount()+1);

        Anchor.setNextElement(NewElement);
        return NewElement;
    };

    public static boolean delElement(Cart TheCart, int Element_Number){
        Element Anchor = TheCart.getFirstElement();
        Element Placeholder = TheCart.getFirstElement();

        if(Element_Number > TheCart.getM_ElementCount() || Element_Number <= 0) {
            System.out.println("Element nicht vorhanden");
            return false; //element is not existing
        }

        for (int i = 0; i < Element_Number; ++i){
            Placeholder = Anchor;
            Anchor = Anchor.getNextElement();
        }

        Placeholder.setNextElement(Anchor.getNextElement());
        Anchor.getComputer().setOnStock(Anchor.getComputer().getOnStock() + Anchor.getM_CountOfComputers());
        Anchor = null;
        TheCart.setM_ElementCount(TheCart.getM_ElementCount()-1);

        return true;
    }



    public static Element searchElement(Cart TheCart, int ItemID){ //search for ItemID
        Element Anchor = TheCart.getFirstElement();
        Element Placeholder = null;
        Boolean isFound = false;

        while (Anchor.getNextElement() != null){
            Anchor = Anchor.getNextElement();

            if(Anchor.getComputer().getItemId() == ItemID){
                Placeholder = Anchor;
                isFound = true;
                System.out.println("Element Gefunden");
                return Placeholder;
            }
        }

        if(!isFound){
            System.out.println("Element nicht Gefunden");
        }

        return null;

    }


}

