package de.t4k.common;

public class Account {
    private AccountRole m_Role; //Die Gespeicherte Enum Variable
    private String m_EMail;
    private String m_Password;
    private Person m_ThePerson;

    //Functions
    public void ChangePW(Account ACC) {
        String altPW ="";
        System.out.println("Geben Sie altes PW ein:");
        altPW =System.in.available();
        if(altPW != ACC.GetPassword()) {
            return;
        }
    }

    //Set/Get Functions
    public void SetRole(AccountRole data) {
        m_Role = data;
    }

    public void SetEMail(String data) {
        m_EMail = data;
    }

    public void SetPassword(String data) {
        m_Password = data;
    }

    public void SetPerson(Person data) {
        m_ThePerson = data;
    }

    public AccountRole GetRole() {
        return m_Role;
    }

    public String GetEMail() {
        return m_EMail;
    }

    public String GetPassword() {
        return m_Password;
    }

    public Person GetPerson() {
        return m_ThePerson;
    }

}