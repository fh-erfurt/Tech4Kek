package t4k.cart;

import t4k.computer.Computer;

public class Object {
    private Computer m_Computer;
    private int m_CountOfComputer;
    private Object m_nextObject;

    public Computer getM_Computer() {
        return m_Computer;
    }

    public void setM_Computer(Computer m_Computer) {
        this.m_Computer = m_Computer;
    }

    public Object getM_nextObject() {
        return m_nextObject;
    }

    public void setM_nextObject(Object m_nextObject) {
        this.m_nextObject = m_nextObject;
    }

    public int getM_CountOfComputers() {
        return m_CountOfComputer;
    }

    public void setM_CountOfComputers(int m_CountOfComputers) {
        this.m_CountOfComputer = m_CountOfComputers;
    }

}
