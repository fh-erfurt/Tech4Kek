package de.tech4kek.common;
import java.util.Scanner;
import de.tech4kek.cart.Cart;

public class Account {
    private int role; //Die Gespeicherte Enum Variable
    private String email;
    private String password;
    private Person person;
    private Cart cart;

    //Functions
    public void ChangePW(Account ACC) {
        String altPW = "", neuPW = "", helper = "";
        boolean isOK = false;
        Scanner Input = new Scanner(System.in);
        System.out.println("Geben Sie das alte PW ein:");
        altPW = Input.next();

        if (altPW != ACC.password) {
            while (isOK == false) {
                isOK = true;
                if (altPW != ACC.password) {
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


    public void SetEMail(String m_EMail) {
        this.email = m_EMail;
    }

    public void SetPassword(String m_Password) {
        this.password = m_Password;
    }

    public void SetPerson(Person m_ThePerson) {
        this.person = m_ThePerson;
    }

    public int GetRole() {
        return role;
    }

    public void SetRole(int m_Role) {
        this.role = m_Role;
    }

    public String GetEMail() {
        return email;
    }

    public String GetPassword() {
        return password;
    }

    public Person GetPerson() {
        return person;
    }

    public void setCart(Cart TheCart){
        cart = TheCart;
    }

    public Cart getCart(){
        return cart;
    }

}