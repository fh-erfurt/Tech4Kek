package t4k.cart;

import t4k.computer.Computer;

public class Object {
    private Computer m_Computer;
    private int m_NumberOfObjects;
    private Object m_nextObject;

    public int get_Number(){return m_NumberOfObjects;}

    public int set_Number(int m_NumberOfObjects){
        this.m_NumberOfObjects = m_NumberOfObjects;
        return m_NumberOfObjects;
    }

}
