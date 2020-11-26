package t4k.common;

public class Computer {
    private int m_ItemId;
    private Details m_ComputerDetails;
    private Manufacturer m_ManufacturerOfComputer;
    private enum m_Category{}
    private int m_StockNumber;
    private Computer m_NextComputer;

    public int getM_ItemId() {
        return m_ItemId;
    }

    public void setM_ItemId(int m_ItemId) {
        this.m_ItemId = m_ItemId;
    }

    public Details getM_ComputerDetails() {
        return m_ComputerDetails;
    }

    public void setM_ComputerDetails(Details m_ComputerDetails) {
        this.m_ComputerDetails = m_ComputerDetails;
    }

    public Manufacturer getM_ManufacturerOfComputer() {
        return m_ManufacturerOfComputer;
    }

    public void setM_ManufacturerOfComputer(Manufacturer m_ManufacturerOfComputer) {
        this.m_ManufacturerOfComputer = m_ManufacturerOfComputer;
    }

    public int getM_StockNumber() {
        return m_StockNumber;
    }

    public void setM_StockNumber(int m_StockNumber) {
        this.m_StockNumber = m_StockNumber;
    }

    public Computer getM_NextComputer() {
        return m_NextComputer;
    }

    public void setM_NextComputer(Computer m_NextComputer) {
        this.m_NextComputer = m_NextComputer;
    }
}


