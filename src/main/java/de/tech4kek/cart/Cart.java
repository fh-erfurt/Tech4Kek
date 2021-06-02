package de.tech4kek.cart;

public class Cart {

    public Cart(){
        m_firstElement = new Element();

        m_firstElement.setM_nextElement(null);
        m_firstElement.setM_Computer(null);
        m_firstElement.setM_CountOfComputers(0);
        m_ElementCount = 0;
    }

    private int m_ElementCount; //count of elements, anchor is the first element
    private Element m_firstElement;

    public Element getM_firstElement() {
        return m_firstElement;
    }

    public void setM_firstElement(Element m_firstElement) {
        this.m_firstElement = m_firstElement;
    }

    public int getM_ElementCount() {
        return m_ElementCount;
    }

    public void setM_ElementCount(int m_ElementCount) {
        this.m_ElementCount = m_ElementCount;
    }
}
