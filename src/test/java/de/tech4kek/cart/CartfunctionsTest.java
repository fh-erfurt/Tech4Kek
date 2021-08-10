package de.tech4kek.cart;

import de.tech4kek.computer.Computer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartfunctionsTest {
/*
    @Test
    public void addElement() {
        //Create Objects
        Cart TheCart = new Cart();
        Computer TheComputer = new Computer();
        Element TheElement = new Element();
        Cart TheCartFunction = new Cart();

        //Give them values
        int number = 5;

        TheComputer.setM_StockNumber(number);
        TheComputer.setM_NextComputer(null);
        TheComputer.setM_ComputerDetails(new Computerdetails());
        TheComputer.getM_ComputerDetails().setM_Price(25.00);

        TheElement.setM_Computer(TheComputer);
        TheElement.setM_CountOfComputers(number);
        TheElement.setM_nextElement(null);

        TheCart.getM_firstElement().setM_nextElement(TheElement);

        //Call function
        Cartfunctions.addElement(TheCartFunction, TheComputer, number);

        //Compare values
        Assertions.assertThat(TheCart.getM_firstElement().getM_nextElement().getM_nextElement()).isEqualTo(TheCartFunction.getM_firstElement().getM_nextElement().getM_nextElement());
        Assertions.assertThat(TheCart.getM_firstElement().getM_nextElement().getM_CountOfComputers()).isEqualTo(TheCartFunction.getM_firstElement().getM_nextElement().getM_CountOfComputers());
        Assertions.assertThat(TheCart.getM_firstElement().getM_nextElement().getM_Computer().getM_StockNumber()).isEqualTo(TheCartFunction.getM_firstElement().getM_nextElement().getM_Computer().getM_StockNumber());
        Assertions.assertThat(TheCart.getM_firstElement().getM_nextElement().getM_Computer().getM_NextComputer()).isEqualTo(TheCartFunction.getM_firstElement().getM_nextElement().getM_Computer().getM_NextComputer());
        Assertions.assertThat(TheCart.getM_firstElement().getM_nextElement().getM_Computer().getM_ComputerDetails().getM_Price()).isEqualTo(TheCartFunction.getM_firstElement().getM_nextElement().getM_Computer().getM_ComputerDetails().getM_Price());

    }

    @Test
    public void delElement() {

    //Create Objects
        Computer TheComputer = new Computer();
        Element Element1 = new Element();
        Element Element2 = new Element();
        Element Element3 = new Element();
        Cart TheCart = new Cart();
        Cart TheCartFunction = new Cart();

    //Give them values
        int ElementToDelete = 2;
        Element1.setM_CountOfComputers(4);
        Element2.setM_CountOfComputers(5);
        Element3.setM_CountOfComputers(6);

        TheCart.getM_firstElement().setM_nextElement(Element1);
        TheCart.getM_firstElement().getM_nextElement().setM_nextElement(Element2);
        TheCart.getM_firstElement().getM_nextElement().getM_nextElement().setM_nextElement(Element3);

        TheCartFunction.getM_firstElement().setM_nextElement(Element1);
        TheCartFunction.getM_firstElement().getM_nextElement().setM_nextElement(Element2);
        TheCartFunction.getM_firstElement().getM_nextElement().getM_nextElement().setM_nextElement(Element3);

    //Delete the element manually
        TheCart.getM_firstElement().getM_nextElement().getM_nextElement().setM_nextElement(null);
        TheCart.getM_firstElement().getM_nextElement().getM_nextElement().setM_nextElement(Element3);
        TheCart.getM_firstElement().getM_nextElement().getM_nextElement().getM_nextElement().setM_nextElement(null);

    //Call function

        Cartfunctions.delElement(TheCart, ElementToDelete);


    //Compare values

        Assertions.assertThat(TheCart.getM_firstElement().getM_nextElement().getM_CountOfComputers()).isEqualTo(TheCartFunction.getM_firstElement().getM_nextElement().getM_CountOfComputers());
        Assertions.assertThat(TheCart.getM_firstElement().getM_nextElement().getM_nextElement().getM_CountOfComputers()).isEqualTo(TheCartFunction.getM_firstElement().getM_nextElement().getM_nextElement().getM_CountOfComputers());
        Assertions.assertThat(TheCart.getM_firstElement().getM_nextElement().getM_nextElement().getM_nextElement().getM_CountOfComputers()).isEqualTo(TheCartFunction.getM_firstElement().getM_nextElement().getM_nextElement().getM_nextElement().getM_CountOfComputers());
    }



 */
    @Test
    public void searchElement() {

    //Create Objects
        Computer TheComputer = new Computer();
        Element Element1 = new Element();
        Element Element2 = new Element();
        Element Element3 = new Element();
        Element Result = new Element();
        Cart TheCart = new Cart();
        Cart TheCartFunction = new Cart();

    //Give them values
        int ElementToSearch = 5;
        Element1.setComputer(new Computer());
        Element1.getComputer().setItemId(4);
        Element2.setComputer(new Computer());
        Element2.getComputer().setItemId(5);
        Element3.setComputer(new Computer());
        Element3.getComputer().setItemId(6);

        TheCart.getFirstElement().setNextElement(Element1);
        TheCart.getFirstElement().getNextElement().setNextElement(Element2);
        TheCart.getFirstElement().getNextElement().getNextElement().setNextElement(Element3);

        Result= Cartfunctions.searchElement(TheCart, ElementToSearch);

        Assertions.assertThat(Element2.getComputer().getItemId()).isEqualTo(Result.getComputer().getItemId());

    }
}

