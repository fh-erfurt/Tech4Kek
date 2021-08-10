package de.tech4kek.cart;

public class Cart {

    public Cart(){
        firstElement = new Element();
        firstElement.setNextElement(null);
        firstElement.setComputer(null);
        firstElement.setM_CountOfComputers(0);
        elementCount = 0;
    }

    private int elementCount; //count of elements, anchor is the first element
    private Element firstElement;

    public Element getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(Element firstElement) {
        this.firstElement = firstElement;
    }

    public int getM_ElementCount() {
        return elementCount;
    }

    public void setM_ElementCount(int m_ElementCount) {
        this.elementCount = m_ElementCount;
    }
}
