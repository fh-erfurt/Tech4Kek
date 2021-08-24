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

                Anchor.setM_CountOfComputers(Anchor.getM_CountOfComputers()+number);
                TheComputer.setOnStock(TheComputer.getOnStock()-number);

                return Anchor; //if pc is already existing
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

    //Is for chaneging the stockcount of an Element in the Cart List


    //Turns the Cart to an Array
    public static Element[] makeArray(Cart TheCart) {

        Element Anchor = TheCart.getFirstElement();

        int counter = 0;
        while (Anchor.getNextElement() != null){
            Anchor = Anchor.getNextElement();
            counter += 1;
        }

        Element CartArray[] = new Element[counter];

        for(int i = 0; i < counter; i++){
            CartArray[i] = new Element();
        }


        Anchor = TheCart.getFirstElement();
        Anchor = Anchor.getNextElement();
        int counter2 = 0;
        while (Anchor != null){

           CartArray[counter2].setM_CountOfComputers(Anchor.getM_CountOfComputers());
           CartArray[counter2].setNextElement(Anchor.getNextElement());
           CartArray[counter2].setComputer(Anchor.getComputer());

            Anchor = Anchor.getNextElement();
            counter2 +=1;
        }

        return CartArray;
    }

    public static Element delNumberOfElements(Cart TheCart, Computer TheComputer, int number){
        Element Anchor = TheCart.getFirstElement();

        int counter = 0;
        while (Anchor.getNextElement() != null){
            Anchor = Anchor.getNextElement();
            counter += 1;
            if(Anchor.getComputer() == TheComputer){

                if(Anchor.getM_CountOfComputers()-number < 0){
                    //less computers in the list then the person wants to remove
                    return null;
                }

                if(Anchor.getM_CountOfComputers()-number == 0){
                    Anchor.setM_CountOfComputers(Anchor.getM_CountOfComputers()-number);
                    TheComputer.setOnStock(TheComputer.getOnStock()+number);
                    delElement(TheCart, counter);
                    return Anchor = TheCart.getFirstElement();
                }


                Anchor.setM_CountOfComputers(Anchor.getM_CountOfComputers()-number);
                TheComputer.setOnStock(TheComputer.getOnStock()+number);

                return Anchor;
            };
        }
        //Element does not exist
        return null;
    }


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

