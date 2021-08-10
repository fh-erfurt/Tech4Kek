package de.tech4kek.computer;

public class Computerdetails{
    private String description;
    private String detailName;
    private double price;
    private String cpuName;
    private double cpuClock;
    private int cpuCoreAmount;
    private int cpuThreadAmount;
    private String gpu;
    private int vramAmount;
    private double gpuClock;
    private String ramName;
    private int ramSize;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    public double getCpuClock() {
        return cpuClock;
    }

    public void setCpuClock(double cpuClock) {
        this.cpuClock = cpuClock;
    }

    public int getCpuCoreAmount() {
        return cpuCoreAmount;
    }

    public void setCpuCoreAmount(int cpuCoreAmount) {
        this.cpuCoreAmount = cpuCoreAmount;
    }

    public int getCpuThreadAmount() {
        return cpuThreadAmount;
    }

    public void setCpuThreadAmount(int cpuThreadAmount) {
        this.cpuThreadAmount = cpuThreadAmount;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getVramAmount() {
        return vramAmount;
    }

    public void setVramAmount(int vramAmount) {
        this.vramAmount = vramAmount;
    }

    public double getGpuClock() {
        return gpuClock;
    }

    public void setGpuClock(double gpuClock) {
        this.gpuClock = gpuClock;
    }

    public String getRamName() {
        return ramName;
    }

    public void setM_Ram(String m_Ram) {
        this.ramName = m_Ram;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
}