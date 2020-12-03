package t4k.cart;

import t4k.cart.Object;
import t4k.computer.Computer;
import t4k.computer.Computerdetails;

public class Cart {

    public Cart(){
        m_firstObject = new Object();
        m_firstObject.setM_nextObject(null);
        m_firstObject.setM_Computer(null);
        m_firstObject.setM_CountOfComputers(0);
        m_ObjectCount = 0;
    }

    private int m_ObjectCount;
    private Object m_firstObject;

    public Object getM_firstObject() {
        return m_firstObject;
    }

    public void setM_firstObject(Object m_firstObject) {
        this.m_firstObject = m_firstObject;
    }

    public int getM_ObjectCount() {
        return m_ObjectCount;
    }

    public void setM_ObjectCount(int m_ObjectCount) {
        this.m_ObjectCount = m_ObjectCount;
    }
}
