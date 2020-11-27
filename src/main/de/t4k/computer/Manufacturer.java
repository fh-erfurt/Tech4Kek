package t4k.computer;

import t4k.common.Address;

public class Manufacturer {
    private String m_ManName;
    private Address m_AddressOfMan;
    private String m_Agent;
    private String m_ManPhoneNumber;

    public String getM_ManName() {
        return m_ManName;
    }

    public void setM_ManName(String m_ManName) {
        this.m_ManName = m_ManName;
    }

    public Address getM_AddressOfMan() {
        return m_AddressOfMan;
    }

    public void setM_AddressOfMan(Address m_AddressOfMan) {
        this.m_AddressOfMan = m_AddressOfMan;
    }

    public String getM_Agent() {
        return m_Agent;
    }

    public void setM_Agent(String m_Agent) {
        this.m_Agent = m_Agent;
    }

    public String getM_ManPhoneNumber() {
        return m_ManPhoneNumber;
    }

    public void setM_ManPhoneNumber(String m_ManPhoneNumber) {
        this.m_ManPhoneNumber = m_ManPhoneNumber;
    }
}
