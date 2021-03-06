package de.tech4kek.common;

import java.time.LocalDateTime;

public class Person {
    private String m_Lastname;
    private String m_Firstname;
    private Address m_TheAddress;

    //Set/Get Functions

    public void setM_Lastname(String m_Lastname) {
        this.m_Lastname = m_Lastname;
    }

    public void setM_Firstname(String m_Firstname) {
        this.m_Firstname = m_Firstname;
    }

    public void setM_TheAddress(Address m_TheAddress) {
        this.m_TheAddress = m_TheAddress;
    }

    public String getM_Lastname() {
        return m_Lastname;
    }

    public String getM_Firstname() {
        return m_Firstname;
    }

    public Address getM_TheAddress() {
        return m_TheAddress;
    }
}
