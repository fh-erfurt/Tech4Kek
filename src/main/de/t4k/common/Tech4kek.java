package de.t4k.common;
//22.11.2020
import java.time.LocalDateTime;


public class Tech4Kek {

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