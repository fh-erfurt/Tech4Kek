package t4k.billing;

import t4k.cart.Element;
import t4k.common.Account;
import t4k.cart.Cart;

public class Bill { //for creating the bill and save it in the DB

    public Bill(Cart TheCart, Account TheAccount, int discount, int mwst){
        m_thisAccount = TheAccount;
        m_Order = TheCart;
        m_isPaid = false;
        m_Discount = discount;
        m_Mwstr = mwst;
        m_Price = calculate_Price();
        m_Billnumber = 0;
    }


    private int m_Billnumber; //letzte muss aus db gezogen werden
    private Account m_thisAccount;
    private Cart m_Order;
    //private Date m_thisDate;
    private int m_Discount; // in Prozent
    private boolean m_isPaid;
    private double m_Price; // mit allen abzügen
    private int m_Mwstr;

    public int getM_Mwstr() {
        return m_Mwstr;
    }

    public double getM_Price() {
        return m_Price;
    }

    public void setM_Discount(int m_Discount) {
        this.m_Discount = m_Discount;
    }

    public double getM_Discount() {
        return m_Discount;
    }

    public void setM_isPaid(boolean m_isPaid) {
        this.m_isPaid = m_isPaid;
    }

    public boolean getM_IsPaid(){
        return m_isPaid;
    }


    public double calculate_Price(){ //Geht, getestet
        Element Anchor = m_Order.getM_firstElement();
        //Scroolt durch die Liste bis zum letzten PC und rechnet preise zusammen
        while (Anchor.getM_nextElement() != null){
            Anchor = Anchor.getM_nextElement();
            m_Price = m_Price + (Anchor.getM_CountOfComputers() * Anchor.getM_Computer().getM_ComputerDetails().getM_Price());
        }

        // discount abziehen
        double zwierg = 0;
        zwierg = m_Price /100 * m_Discount;
        m_Price = m_Price - zwierg;
        //mwst 16%
        zwierg = 0;
        zwierg = m_Price /100 * m_Mwstr;
        m_Price = m_Price + zwierg;

        return m_Price;
    }

    public double calculate_Discount(){

        return m_Price;
    }

    public int print_Bill(){
        Element Anchor = m_Order.getM_firstElement();
        System.out.println("Vielen Dank für Ihren Einkauf bei Techkek");
        System.out.println("Sie haben folgende Produkte gekauft:");

        //Scroolt durch die Liste bis zum letzten PC und gibt daten aus
        while (Anchor.getM_nextElement() != null){
            Anchor = Anchor.getM_nextElement();

            System.out.print(Anchor.getM_CountOfComputers());
            System.out.print(" mal den: ");
            System.out.print(Anchor.getM_Computer().getM_ComputerDetails().getM_DetailName());
            System.out.print(" für ");
            System.out.print(Anchor.getM_Computer().getM_ComputerDetails().getM_Price());
            System.out.print(" Euro.");
            System.out.println("");

        }

        System.out.print("Preis inklusive Mwstr von ");
        System.out.print(m_Mwstr);
        System.out.print("% ");
        System.out.print("und ");
        System.out.print(m_Discount);
        System.out.println("% Discount: ");
        System.out.print(m_Price);
        System.out.print("€");
        return m_Billnumber;
    }

    public int save_Bill(){
        //save Bill somehow in db
        return m_Billnumber;
    }
}
