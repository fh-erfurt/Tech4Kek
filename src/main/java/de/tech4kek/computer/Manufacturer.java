package de.tech4kek.computer;

import de.tech4kek.common.Address;

public class Manufacturer {
    private String m_ManName;
    private Address m_AddressOfMan;
    private String m_Agent;

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

}
