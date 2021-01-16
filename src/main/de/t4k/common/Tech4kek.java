package t4k.common;
import t4k.computer.*;
import t4k.warehouse.*;
import static t4k.warehouse.WarehouseFunctions.*;
import t4k.cart.*;
import t4k.billing.*;
//test



public class Tech4kek {

    public static void main(String[] args) {
        System.out.println("Hello World");

        //Anmelden Funktion, nimmt acc email und pw an und sucht eintrag in der DB und erstellt eine acc instanz für die person

        // Es wir instanz für warehouse erstellt und da alle daten aus der produkt tabelle reingeladen in die verkettete liste
        // Es wird instanz für card erstellt und da alle daten aus der produkt tabelle reingeladen in die verkettete liste
        // Kunde kann liste durchgehen und Produkt und anzahl auswählen über funktion die liste durchscroolt und ausgibt
        // Diese dinge werden Cart hinzugefügt
        // Wenn Kunde fertig ist wird rechnung erstellt und in db gespeichert(als noch nicht bearbeitet) so wie ausgegeben an den Kunden


        //Tests:

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

        Warehouse TheWarehouse = new Warehouse();
        //in schleife werden alle einträge reingeladen
        addComputer(TheWarehouse, "ErsterPC", 1, 10);
        addComputer(TheWarehouse, "ZweiterPC", 2, 4);
        addComputer(TheWarehouse, "DritterPC", 3, 8);

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

        Computerdetails PC1Details = new Computerdetails();
        Computerdetails PC2Details = new Computerdetails();
        Computerdetails PC3Details = new Computerdetails();

        PC1Details.setM_Price(300);
        PC2Details.setM_Price(200);
        PC3Details.setM_Price(400);

        PC1Details.setM_DetailName("Sony K6");
        PC2Details.setM_DetailName("HP irgendwas");
        PC3Details.setM_DetailName("RAZZAR");

        PC1.setM_ComputerDetails(PC1Details);
        PC2.setM_ComputerDetails(PC2Details);
        PC3.setM_ComputerDetails(PC3Details);

        PC1.setM_StockNumber(4);
        PC2.setM_StockNumber(5);
        PC3.setM_StockNumber(8);

        Cart TheCart = new Cart();
        Cartfunctions.addElement(TheCart, PC1, 3); //Anzahl der PCs die gekauft werden sollen
        Cartfunctions.addElement(TheCart, PC2, 2);
        Cartfunctions.addElement(TheCart, PC3, 5);

        Cartfunctions.delElement(TheCart, 1);

        Element AnchorCart = TheCart.getM_firstElement();
        while (AnchorCart.getM_nextElement() != null) {
            AnchorCart = AnchorCart.getM_nextElement();
            System.out.println(AnchorCart.getM_CountOfComputers());
        }

        //System.out.println(TheCart.getM_ElementCount());

        Element ELSucherg = TheCart.getM_firstElement();

       ELSucherg= Cartfunctions.searchElement(TheCart, 22);
        System.out.println(ELSucherg.getM_Computer().getM_ItemId());

        Bill TheBill = new Bill(TheCart, TheACC, 25, 16);
        System.out.println("The price is");
        System.out.println(TheBill.getM_Price());
        TheBill.print_Bill();


    }

}