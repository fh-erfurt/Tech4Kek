package de.tech4kek.billing;

import de.tech4kek.cart.Element;
import de.tech4kek.common.Account;
import de.tech4kek.computer.Computer;
import de.tech4kek.computer.Computerdetails;
import de.tech4kek.cart.Cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BillTest {

    @Test
    public void calculate_Price() {

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

        //Computer1Details.setM_Price(300);
        //Computer2Details.setM_Price(200);
        //Computer3Details.setM_Price(400);

        Computer1.setComputerdetails(Computer1Details);
        Computer2.setComputerdetails(Computer2Details);
        Computer3.setComputerdetails(Computer3Details);

        Element1.setComputer(Computer1);
        Element2.setComputer(Computer2);
        Element3.setComputer(Computer3);

        Element1.setM_CountOfComputers(3);
        Element2.setM_CountOfComputers(2);
        Element3.setM_CountOfComputers(5);

        TheCart.getFirstElement().setNextElement(Element1);
        TheCart.getFirstElement().getNextElement().setNextElement(Element2);
        TheCart.getFirstElement().getNextElement().getNextElement().setNextElement(Element3);

        //Call function
        //Bill TheBill = new Bill(TheCart, TheAcc, 25, 16);
        //Result = TheBill.getPrice();

        //Compare values
        Assertions.assertThat(Result).isEqualTo(2871.0);


    }
}

