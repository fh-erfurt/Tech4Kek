package de.tech4kek.computer;

public class Computer {
    private int itemId;
    private Computerdetails computerdetails;
    private Manufacturer manufacturerOfComputer;
    private Category category;
    private int OnStock;

    private Computer nextComputer;

    public int getOnStock() {
        return OnStock;
    }

    public void setOnStock(int onStock) {
        OnStock = onStock;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public Computerdetails getComputerdetails() {
        return computerdetails;
    }

    public void setComputerdetails(Computerdetails computerdetails) {
        this.computerdetails = computerdetails;
    }

    public Manufacturer getManufacturerOfComputer() {
        return manufacturerOfComputer;
    }

    public void setManufacturerOfComputer(Manufacturer manufacturerOfComputer) {
        this.manufacturerOfComputer = manufacturerOfComputer;
    }

    public Computer getNextComputer() {
        return nextComputer;
    }

    public void setNextComputer(Computer nextComputer) {
        this.nextComputer = nextComputer;
    }
}


