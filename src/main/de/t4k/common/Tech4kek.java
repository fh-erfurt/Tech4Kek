package t4k.common;

import java.time.LocalDateTime;


public class Tech4kek {

    public static void main(String[] args) {
        System.out.println("Hello");

        //Anmeldefenster

        //Daten werden anhand von email in DB gesucht und
        //pw wird verglichen

        //Daten werden in Program geladen aus DB in Acc

        Account TheACC = new Account();
        TheACC.SetEMail("Jan204@t-online.de");
        TheACC.SetPassword("Techkekerino123");
        TheACC.SetRole(AccountRole.Customer);
        Person ThePerson = new Person();
        //Input Person Data
        TheACC.SetPerson(ThePerson);

        System.out.println(TheACC.GetEMail());

    }

}