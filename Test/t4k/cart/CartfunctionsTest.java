package t4k.cart;

import main.de.t4k.computer.Computer;
import main.de.t4k.computer.Computerdetails;
import main.de.t4k.cart.Element;
import main.de.t4k.cart.Cart;
import main.de.t4k.cart.Cartfunctions;

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
        Element1.setM_Computer(new Computer());
        Element1.getM_Computer().setM_ItemId(4);
        Element2.setM_Computer(new Computer());
        Element2.getM_Computer().setM_ItemId(5);
        Element3.setM_Computer(new Computer());
        Element3.getM_Computer().setM_ItemId(6);

        TheCart.getM_firstElement().setM_nextElement(Element1);
        TheCart.getM_firstElement().getM_nextElement().setM_nextElement(Element2);
        TheCart.getM_firstElement().getM_nextElement().getM_nextElement().setM_nextElement(Element3);

        Result= Cartfunctions.searchElement(TheCart, ElementToSearch);

        Assertions.assertThat(Element2.getM_Computer().getM_ItemId()).isEqualTo(Result.getM_Computer().getM_ItemId());

    }
}

