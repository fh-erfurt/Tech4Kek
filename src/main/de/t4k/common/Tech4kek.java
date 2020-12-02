package t4k.common;
import t4k.computer.*;
import t4k.warehouse.*;
import static t4k.warehouse.WarehouseFunctions.*;
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