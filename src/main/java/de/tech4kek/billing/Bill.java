package de.tech4kek.billing;

import de.tech4kek.cart.Element;
import de.tech4kek.common.Account;
import de.tech4kek.cart.Cart;

public class Bill { //for creating the bill and save it in the DB

    public Bill(Cart cart, Account account, int discount, int taxes, int billnumber){
        this.account = account;
        this.cart = cart;
        isPaid = false;
        this.discount = discount;
        this.taxes = taxes;
        this.price = calculate_Price();
        this.billnumber = billnumber;
    }


    private int billnumber; //letzte muss aus db gezogen werden
    private Account account;
    private Cart cart;
    //private Date m_thisDate;
    private int discount; // in Prozent
    private boolean isPaid;
    private double price; // mit allen abzügen
    private int taxes;

    public int getMwstr() {
        return taxes;
    }

    public double getPrice() {
        return price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public boolean getM_IsPaid(){
        return isPaid;
    }


    public double calculate_Price(){ //Geht, getestet
        Element Anchor = cart.getFirstElement();
        //Scroolt durch die Liste bis zum letzten PC und rechnet preise zusammen
        while (Anchor.getNextElement() != null){
            Anchor = Anchor.getNextElement();
            price = price + (Anchor.getM_CountOfComputers() * Anchor.getComputer().getComputerdetails().getPrice());
        }

        // discount abziehen
        price -= price * discount/100;
        price += price * taxes/100;

        return price;
    }


    public int print_Bill(){
        Element Anchor = cart.getFirstElement();
        System.out.println("Vielen Dank für Ihren Einkauf bei Techkek");
        System.out.println("Sie haben folgende Produkte gekauft:");

        //Scroolt durch die Liste bis zum letzten PC und gibt daten aus
        while (Anchor.getNextElement() != null){
            Anchor = Anchor.getNextElement();

            System.out.print(Anchor.getM_CountOfComputers());
            System.out.print(" mal den: ");
            System.out.print(Anchor.getComputer().getComputerdetails().getDetailName());
            System.out.print(" für ");
            System.out.print(Anchor.getComputer().getComputerdetails().getPrice());
            System.out.print(" Euro.");
            System.out.println("");

        }

        System.out.print("Preis inklusive Mwstr von ");
        System.out.print(taxes);
        System.out.print("% ");
        System.out.print("und ");
        System.out.print(discount);
        System.out.println("% Discount: ");
        System.out.print(price);
        System.out.print("€");
        return billnumber;
    }

    public int save_Bill(){
        //save Bill somehow in db
        return billnumber;
    }
}
