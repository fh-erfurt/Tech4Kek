package t4k.billing;

import t4k.common.Account;
import t4k.cart.Cart;
import t4k.cart.Cartfunctions;

public class Bill {
    private int m_Billnumber;
    private Account m_thisAccount;
    private Cart m_Order;
    //private Date m_thisDate;
    private double m_Discount;
    private boolean m_isPaid;

    public double calculate_Price(){
        double Price=0;
        return Price;
    }

    public int print_Bill(int m_Billnumber){
        //print Bill somehow
        return m_Billnumber;
    }

    public int save_Bill(int m_Billnumber){
        //print Bill somehow
        return m_Billnumber;
    }
}
