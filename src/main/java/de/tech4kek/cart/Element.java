package de.tech4kek.cart;

import de.tech4kek.computer.Computer;

public class Element {
    private Computer computer;
    private int countOfComputer;
    private Element nextElement;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Element getNextElement() {
        return nextElement;
    }

    public void setNextElement(Element nextElement) {
        this.nextElement = nextElement;
    }

    public int getM_CountOfComputers() {
        return countOfComputer;
    }

    public void setM_CountOfComputers(int m_CountOfComputers) {
        this.countOfComputer = m_CountOfComputers;
    }

}

