package t4k.cart;

import t4k.cart.Object;

public class Cart {
    private int m_ObjectCount;
    private Object m_firstObject;


    public int setObjectCount(int m_ObjectCount){
        this.m_ObjectCount = m_ObjectCount;
        return m_ObjectCount;
    }

    public int getObjectCount(){
        return m_ObjectCount;
    }

    public Object getfirstObject(){
        return m_firstObject;
    }
}
