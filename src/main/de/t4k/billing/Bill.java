package t4k.billing;

import t4k.cart.Element;
import t4k.common.Account;
import t4k.cart.Cart;
import t4k.cart.Cartfunctions;

public class Bill { //for creating the bill and save it in the DB

    public Bill(Cart TheCart, Account TheAccount){
        m_thisAccount = TheAccount;
        m_Order = TheCart;
        m_isPaid = false;
        m_Price = 0;
        m_Discount = 0;
        m_Billnumber = 0;
    }


    private int m_Billnumber; //letzte muss aus db gezogen werden
    private Account m_thisAccount;
    private Cart m_Order;
    //private Date m_thisDate;
    private double m_Discount;
    private boolean m_isPaid;
    private double m_Price;

    public double getM_Price() {
        return m_Price;
    }

    public void setM_Discount(double m_Discount) {
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


    public double calculate_Price(){ //Noch ungetestet
        Element Anchor = m_Order.getM_firstElement();
        //Scroolt durch die Liste bis zum letzten PC
        while (Anchor.getM_nextElement() != null){
            Anchor = Anchor.getM_nextElement();
            m_Price = m_Price + (Anchor.getM_CountOfComputers() * Anchor.getM_Computer().getM_ComputerDetails().getM_Price());
        }
        return m_Price;
    }

    public int print_Bill(){
        //print Bill somehow
        return m_Billnumber;
    }

    public int save_Bill(){
        //save Bill somehow in db
        return m_Billnumber;
    }
}
