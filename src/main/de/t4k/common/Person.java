package t4k.common;

import java.time.LocalDateTime;

public class Person {
    private String m_Lastname;
    private String m_Firstname;
    private LocalDateTime m_Birthday;
    private Address TheAddress;

    //Set/Get Functions

    public void setM_Lastname(String m_Lastname) {
        this.m_Lastname = m_Lastname;
    }

    public void setM_Firstname(String m_Firstname) {
        this.m_Firstname = m_Firstname;
    }

    public void setM_Birthday(LocalDateTime m_Birthday) {
        this.m_Birthday = m_Birthday;
    }

    public void setTheAddress(Address theAddress) {
        TheAddress = theAddress;
    }

    public String getM_Lastname() {
        return m_Lastname;
    }

    public String getM_Firstname() {
        return m_Firstname;
    }

    public LocalDateTime getM_Birthday() {
        return m_Birthday;
    }

    public Address getTheAddress() {
        return TheAddress;
    }
}
