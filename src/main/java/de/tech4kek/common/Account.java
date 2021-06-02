package de.tech4kek.common;
import java.util.Scanner;
import de.tech4kek.cart.Cart;

public class Account {
    private AccountRole m_Role; //Die Gespeicherte Enum Variable
    private String m_EMail;
    private String m_Password;
    private Person m_ThePerson;
    private Cart m_TheCart;

    //Functions
    public void ChangePW(Account ACC) {
        String altPW = "", neuPW = "", helper = "";
        boolean isOK = false;
        Scanner Input = new Scanner(System.in);
        System.out.println("Geben Sie das alte PW ein:");
        altPW = Input.next();

        if (altPW != ACC.m_Password) {
            while (isOK == false) {
                isOK = true;
                if (altPW != ACC.m_Password) {
                    System.out.println("PW ist nicht korrekt:");
                    isOK = false;
                    altPW = Input.next();
                }
            }
        }
        do {
            System.out.println("Geben Sie das neue PW ein:");
            neuPW = Input.next();
            System.out.println("Geben Sie das neue PW erneut ein:");
            helper = Input.next();

            if(neuPW != helper) {
                System.out.println("Passwörter stimmen nicht überein");
            }
        }while(neuPW != helper);
        ACC.SetPassword(neuPW); //or change it in the DB in the future
        System.out.println("Passwort wurde geändert");
    }

    //Set/Get Functions
    public void SetRole(AccountRole m_Role) {
        this.m_Role = m_Role;
    }

    public void SetEMail(String m_EMail) {
        this.m_EMail = m_EMail;
    }

    public void SetPassword(String m_Password) {
        this.m_Password = m_Password;
    }

    public void SetPerson(Person m_ThePerson) {
        this.m_ThePerson = m_ThePerson;
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

    public void setM_TheCart(Cart TheCart){
        m_TheCart = TheCart;
    }

    public Cart getM_TheCart(){
        return m_TheCart;
    }

}