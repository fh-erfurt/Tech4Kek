package de.tech4kek.common;

public class Address {
    private String m_Street;
    private String m_HouseNr;
    private int m_ZIP;
    private String m_City;
    private String m_Country;

    //Set/Get Functions

    public void setM_Street(String m_Street) {
        this.m_Street = m_Street;
    }

    public void setM_HouseNr(String m_HouseNr) {
        this.m_HouseNr = m_HouseNr;
    }

    public void setM_ZIP(int m_ZIP) {
        this.m_ZIP = m_ZIP;
    }

    public void setM_City(String m_City) {
        this.m_City = m_City;
    }

    public void setM_Country(String m_Country) {
        this.m_Country = m_Country;
    }

    public String getM_Street() {
        return m_Street;
    }

    public String getM_HouseNr() {
        return m_HouseNr;
    }

    public int getM_ZIP() {
        return m_ZIP;
    }

    public String getM_City() {
        return m_City;
    }

    public String getM_Country() {
        return m_Country;
    }


}
