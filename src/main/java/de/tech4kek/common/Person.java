package de.tech4kek.common;

public class Person {
    private String lastname;
    private String firstname;
    private Address address;

    //Set/Get Functions

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public Address getAddress() {
        return address;
    }
}
