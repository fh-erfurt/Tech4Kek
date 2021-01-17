package t4k.warehouse;

import t4k.computer.Computerdetails;
import t4k.warehouse.*;
import t4k.common.Address;
import t4k.computer.Computer;
import t4k.computer.Manufacturer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseFunctionsTest {

    @Test
    public void shouldAddComputer() throws Exception {
        Manufacturer ManufacturerTest = new Manufacturer();
        Address AddressTest = new Address();
        Warehouse WarehouseTest = new Warehouse();
        Computerdetails TestDetails = new Computerdetails();
        Computer TestPC = new Computer();
        Computer ErgPC = null;

        TestDetails.setM_Price(1.00);
        TestDetails.setM_DetailName("TestdetailName");
        TestDetails.setM_Description("This is a PC");
        TestDetails.setM_CpuClock(3.60);
        TestDetails.setM_CpuCoreAmount(6);
        TestDetails.setM_CpuName("Amd Ryzen 2600");
        TestDetails.setM_CpuThreadAmount(12);
        TestDetails.setM_Gpu("RX580");
        TestDetails.setM_GpuClock(1800.0);
        TestDetails.setM_Ram("Corsair Test");
        TestDetails.setM_RamSize(16);
        TestDetails.setM_VramAmount(8);

        AddressTest.setM_City("TestCity");
        AddressTest.setM_Country("TestCountry");
        AddressTest.setM_HouseNr("1a");
        AddressTest.setM_Street("TestStreet");
        AddressTest.setM_ZIP(11111);

        ManufacturerTest.setM_AddressOfMan(AddressTest);
        ManufacturerTest.setM_ManName("TestName");
        ManufacturerTest.setM_Agent("TestAgent");
        ManufacturerTest.setM_ManPhoneNumber("+49 1111 1111111");

        TestPC.setM_NextComputer(null);
        TestPC.setM_ManufacturerOfComputer(ManufacturerTest);
        TestPC.setM_ComputerDetails(TestDetails);
        TestPC.setM_ItemId(1);
        TestPC.setM_StockNumber(10);

        ErgPC = WarehouseFunctions.addComputer(WarehouseTest, TestDetails.getM_Description(), TestPC.getM_ItemId(), TestPC.getM_StockNumber(), TestDetails.getM_DetailName(), TestDetails.getM_Price(), TestDetails.getM_CpuClock(), TestDetails.getM_CpuCoreAmount(),
                TestDetails.getM_CpuName(), TestDetails.getM_CpuThreadAmount(), TestDetails.getM_Gpu(), TestDetails.getM_GpuClock(), TestDetails.getM_Ramname(), TestDetails.getM_RamSize(), TestDetails.getM_VramAmount(), ManufacturerTest.getM_ManPhoneNumber(),
                ManufacturerTest.getM_Agent(), ManufacturerTest.getM_ManName(), AddressTest.getM_ZIP(), AddressTest.getM_Street(), AddressTest.getM_HouseNr(), AddressTest.getM_Country(), AddressTest.getM_City());

        Assert.assertEquals(TestPC, ErgPC);

    }
}