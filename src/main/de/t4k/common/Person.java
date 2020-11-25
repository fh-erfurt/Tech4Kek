package t4k.common;

import java.time.LocalDateTime;

public class Person {
    private String m_lastname;
    private String m_firstname;
    private LocalDateTime m_Birthday;
    private Address TheAddress;

    //Set/Get Functions

    public void setM_lastname(String m_lastname) {
        this.m_lastname = m_lastname;
    }

    public void setM_firstname(String m_firstname) {
        this.m_firstname = m_firstname;
    }

    public void setM_Birthday(LocalDateTime m_Birthday) {
        this.m_Birthday = m_Birthday;
    }

    public void setTheAddress(Address theAddress) {
        TheAddress = theAddress;
    }

    public String getM_lastname() {
        return m_lastname;
    }

    public String getM_firstname() {
        return m_firstname;
    }

    public LocalDateTime getM_Birthday() {
        return m_Birthday;
    }

    public Address getTheAddress() {
        return TheAddress;
    }
}
