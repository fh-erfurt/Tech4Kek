package t4k.common;
import t4k.computer.*;
import t4k.warehouse.*;
import static t4k.warehouse.WarehouseFunctions.*;
import t4k.cart.*;
//test



public class Tech4kek {

    public static void main(String[] args) {
        System.out.println("Hello World");

        //Anmeldefenster

        //Daten werden anhand von email in DB gesucht und
        //pw wird verglichen

        //Daten werden in Program geladen aus DB in Acc

        //Tests:
        Warehouse TheWarehouse = new Warehouse();
        addComputer(TheWarehouse, "ErsterPC", 1);
        addComputer(TheWarehouse, "ZweiterPC", 2);
        addComputer(TheWarehouse, "DritterPC", 3);

        delComputer(TheWarehouse, 1);

        //Funktion zum Printen der Computer als test
        Computer Anchor = TheWarehouse.getFirstComputer();
        while (Anchor.getM_NextComputer() != null) {
            Anchor = Anchor.getM_NextComputer();
            System.out.println(Anchor.getM_ComputerDetails().getM_Description());
        }

        Computer PC1 = new Computer();
        Computer PC2 = new Computer();
        Computer PC3 = new Computer();

        PC1.setM_ItemId(11);
        PC2.setM_ItemId(22);
        PC3.setM_ItemId(33);

        Cart TheCart = new Cart();
        Cartfunctions.addElement(TheCart, PC1, 20); //Anzahl der PCs die gekauft werden sollen
        Cartfunctions.addElement(TheCart, PC2, 50);
        Cartfunctions.addElement(TheCart, PC3, 10);

        Cartfunctions.delElement(TheCart, 1);

        Element AnchorCart = TheCart.getM_firstElement();
        while (AnchorCart.getM_nextElement() != null) {
            AnchorCart = AnchorCart.getM_nextElement();
            System.out.println(AnchorCart.getM_CountOfComputers());
        }

        System.out.println(TheCart.getM_ElementCount());

        Element ELSucherg = TheCart.getM_firstElement();

       ELSucherg= Cartfunctions.searchElement(TheCart, 22);
        System.out.println(ELSucherg.getM_Computer().getM_ItemId());



        Computer PC = new Computer();
        Person ThePerson = new Person();
        Account TheACC = new Account();
        TheACC.SetEMail("Jan204@t-online.de");
        TheACC.SetPassword("Techkekerino123");
        TheACC.SetRole(AccountRole.Customer);
        //Set Person Data from DB
        TheACC.SetPerson(ThePerson);
        TheACC.GetPerson().setM_firstname("Arnold");

        System.out.println(TheACC.GetEMail());

    }

}