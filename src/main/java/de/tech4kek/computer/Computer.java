package de.tech4kek.computer;

public class Computer {
    private int m_ItemId;
    private Computerdetails m_ComputerDetails;
    private Manufacturer m_ManufacturerOfComputer;
    private Category m_Category;
    private Computer m_NextComputer;

    public int getM_ItemId() {
        return m_ItemId;
    }

    public void setM_ItemId(int m_ItemId) {
        this.m_ItemId = m_ItemId;
    }

    public Computerdetails getM_ComputerDetails() {
        return m_ComputerDetails;
    }

    public void setM_ComputerDetails(Computerdetails m_ComputerDetails) {
        this.m_ComputerDetails = m_ComputerDetails;
    }

    public Manufacturer getM_ManufacturerOfComputer() {
        return m_ManufacturerOfComputer;
    }

    public void setM_ManufacturerOfComputer(Manufacturer m_ManufacturerOfComputer) {
        this.m_ManufacturerOfComputer = m_ManufacturerOfComputer;
    }

    public Computer getM_NextComputer() {
        return m_NextComputer;
    }

    public void setM_NextComputer(Computer m_NextComputer) {
        this.m_NextComputer = m_NextComputer;
    }
}


