package de.tech4kek.computer;

import de.tech4kek.common.Address;

public class Manufacturer {
    private String manufacturerName;
    private Address manufacturerAddress;
    private String manufacturerAgent;

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Address getManufacturerAddress() {
        return manufacturerAddress;
    }

    public void setManufacturerAddress(Address manufacturerAddress) {
        this.manufacturerAddress = manufacturerAddress;
    }

    public String getManufacturerAgent() {
        return manufacturerAgent;
    }

    public void setManufacturerAgent(String manufacturerAgent) {
        this.manufacturerAgent = manufacturerAgent;
    }

}
