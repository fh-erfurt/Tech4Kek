package t4k.billing;

import org.junit.jupiter.api.Test;
import t4k.cart.Element;
import t4k.common.Account;
import t4k.computer.Computer;
import t4k.computer.Computerdetails;
import t4k.cart.Cart;


import static org.junit.jupiter.api.Assertions.*;

class BillTest {

    @Test
    void calculate_Price() {

        //Create Objects
        Cart TheCart = new Cart();
        Account TheAcc = new Account();
        Element Element1 = new Element();
        Element Element2 = new Element();
        Element Element3 = new Element();
        Computer Computer1 = new Computer();
        Computer Computer2 = new Computer();
        Computer Computer3 = new Computer();
        double Result = 0;

        //Give them values
        Computerdetails Computer1Details = new Computerdetails();
        Computerdetails Computer2Details = new Computerdetails();
        Computerdetails Computer3Details = new Computerdetails();

        Computer1Details.setM_Price(300);
        Computer2Details.setM_Price(200);
        Computer3Details.setM_Price(400);

        Computer1.setM_ComputerDetails(Computer1Details);
        Computer2.setM_ComputerDetails(Computer2Details);
        Computer3.setM_ComputerDetails(Computer3Details);

        Element1.setM_Computer(Computer1);
        Element2.setM_Computer(Computer2);
        Element3.setM_Computer(Computer3);

        Element1.setM_CountOfComputers(3);
        Element2.setM_CountOfComputers(2);
        Element3.setM_CountOfComputers(5);

        TheCart.getM_firstElement().setM_nextElement(Element1);
        TheCart.getM_firstElement().getM_nextElement().setM_nextElement(Element2);
        TheCart.getM_firstElement().getM_nextElement().getM_nextElement().setM_nextElement(Element3);

        //Call function
        Bill TheBill = new Bill(TheCart, TheAcc, 25, 16);
        Result = TheBill.getM_Price();

        //Compare values
        assertEquals(Result, 2871.0);


    }
}