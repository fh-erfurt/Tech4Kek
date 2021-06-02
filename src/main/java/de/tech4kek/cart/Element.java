package de.tech4kek.cart;

import de.tech4kek.computer.Computer;

public class Element {
    private Computer m_Computer;
    private int m_CountOfComputer;
    private Element m_nextElement;

    public Computer getM_Computer() {
        return m_Computer;
    }

    public void setM_Computer(Computer m_Computer) {
        this.m_Computer = m_Computer;
    }

    public Element getM_nextElement() {
        return m_nextElement;
    }

    public void setM_nextElement(Element m_nextElement) {
        this.m_nextElement = m_nextElement;
    }

    public int getM_CountOfComputers() {
        return m_CountOfComputer;
    }

    public void setM_CountOfComputers(int m_CountOfComputers) {
        this.m_CountOfComputer = m_CountOfComputers;
    }

}

