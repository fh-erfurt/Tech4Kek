package t4k.warehouse;

import org.junit.jupiter.api.Test;
import t4k.cart.Cart;
import t4k.cart.Cartfunctions;
import t4k.cart.Element;
import t4k.common.Address;
import t4k.computer.Computer;
import t4k.computer.Computerdetails;
import t4k.computer.Manufacturer;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseFunctionsTest {

    @Test
    void addComputer() {

        //Create Objects
        Manufacturer ManufacturerTest = new Manufacturer();
        Address AddressTest = new Address();
        Warehouse WarehouseTest = new Warehouse();
        Computerdetails TestDetails = new Computerdetails();
        Computer TestPC = new Computer();
        Computer ErgPC = null;


        //Give them values
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

        //Call function
        ErgPC = WarehouseFunctions.addComputer(WarehouseTest, TestDetails.getM_Description(), TestPC.getM_ItemId(), TestPC.getM_StockNumber(), TestDetails.getM_DetailName(), TestDetails.getM_Price(), TestDetails.getM_CpuClock(), TestDetails.getM_CpuCoreAmount(),
                TestDetails.getM_CpuName(), TestDetails.getM_CpuThreadAmount(), TestDetails.getM_Gpu(), TestDetails.getM_GpuClock(), TestDetails.getM_Ramname(), TestDetails.getM_RamSize(), TestDetails.getM_VramAmount(), ManufacturerTest.getM_ManPhoneNumber(),
                ManufacturerTest.getM_Agent(), ManufacturerTest.getM_ManName(), AddressTest.getM_ZIP(), AddressTest.getM_Street(), AddressTest.getM_HouseNr(), AddressTest.getM_Country(), AddressTest.getM_City());

        //Compare values
        assertEquals(TestPC.getM_ComputerDetails().getM_Description(), ErgPC.getM_ComputerDetails().getM_Description());
        assertEquals(TestPC.getM_ItemId(), ErgPC.getM_ItemId());
        assertEquals(TestPC.getM_StockNumber(), ErgPC.getM_StockNumber());
        assertEquals(TestPC.getM_ComputerDetails().getM_DetailName(), ErgPC.getM_ComputerDetails().getM_DetailName());
        assertEquals(TestPC.getM_ComputerDetails().getM_Price(), ErgPC.getM_ComputerDetails().getM_Price());
        assertEquals(TestPC.getM_ComputerDetails().getM_CpuClock(), ErgPC.getM_ComputerDetails().getM_CpuClock());
        assertEquals(TestPC.getM_ComputerDetails().getM_CpuCoreAmount(), ErgPC.getM_ComputerDetails().getM_CpuCoreAmount());
        assertEquals(TestPC.getM_ComputerDetails().getM_CpuName(), ErgPC.getM_ComputerDetails().getM_CpuName());
        assertEquals(TestPC.getM_ComputerDetails().getM_CpuThreadAmount(), ErgPC.getM_ComputerDetails().getM_CpuThreadAmount());
        assertEquals(TestPC.getM_ComputerDetails().getM_Gpu(), ErgPC.getM_ComputerDetails().getM_Gpu());
        assertEquals(TestPC.getM_ComputerDetails().getM_GpuClock(), ErgPC.getM_ComputerDetails().getM_GpuClock());
        assertEquals(TestPC.getM_ComputerDetails().getM_Ramname(), ErgPC.getM_ComputerDetails().getM_Ramname());
        assertEquals(TestPC.getM_ComputerDetails().getM_RamSize(), ErgPC.getM_ComputerDetails().getM_RamSize());
        assertEquals(TestPC.getM_ComputerDetails().getM_VramAmount(), ErgPC.getM_ComputerDetails().getM_VramAmount());
        assertEquals(TestPC.getM_ManufacturerOfComputer().getM_ManPhoneNumber(), ErgPC.getM_ManufacturerOfComputer().getM_ManPhoneNumber());
        assertEquals(TestPC.getM_ManufacturerOfComputer().getM_Agent(), ErgPC.getM_ManufacturerOfComputer().getM_Agent());
        assertEquals(TestPC.getM_ManufacturerOfComputer().getM_ManName(), ErgPC.getM_ManufacturerOfComputer().getM_ManName());
        assertEquals(TestPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_ZIP(), ErgPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_ZIP());
        assertEquals(TestPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_Street(), ErgPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_Street());
        assertEquals(TestPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_HouseNr(), ErgPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_HouseNr());
        assertEquals(TestPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_Country(), ErgPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_Country());
        assertEquals(TestPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_City(), ErgPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_City());
    }

    @Test
    void delComputer() {

        //Create Objects
        Warehouse TheWarehouse = new Warehouse();
        Warehouse TheWarehouseFunction = new Warehouse();
        Computer Computer1 = new Computer();
        Computer Computer2 = new Computer();
        Computer Computer3 = new Computer();
        Computer Result = new Computer();



        //Give them values
        int ElementToDelete = 2;

        Computer1.setM_ItemId(1);
        Computer2.setM_ItemId(2);
        Computer3.setM_ItemId(3);


        TheWarehouse.getFirstComputer().setM_NextComputer(Computer1);
        TheWarehouse.getFirstComputer().getM_NextComputer().setM_NextComputer(Computer2);
        TheWarehouse.getFirstComputer().getM_NextComputer().getM_NextComputer().setM_NextComputer(Computer3);

        TheWarehouseFunction.getFirstComputer().setM_NextComputer(Computer1);
        TheWarehouseFunction.getFirstComputer().getM_NextComputer().setM_NextComputer(Computer2);
        TheWarehouseFunction.getFirstComputer().getM_NextComputer().getM_NextComputer().setM_NextComputer(Computer3);

        //Delete the element manually
        TheWarehouse.getFirstComputer().getM_NextComputer().getM_NextComputer().setM_NextComputer(null);
        TheWarehouse.getFirstComputer().getM_NextComputer().getM_NextComputer().setM_NextComputer(Computer3);
        TheWarehouse.getFirstComputer().getM_NextComputer().getM_NextComputer().getM_NextComputer().setM_NextComputer(null);

        //Call function

        Result= WarehouseFunctions.delComputer(TheWarehouseFunction, ElementToDelete);


        //Compare values
        assertEquals(TheWarehouse.getFirstComputer().getM_ItemId(), TheWarehouseFunction.getFirstComputer().getM_ItemId());
        assertEquals(TheWarehouse.getFirstComputer().getM_NextComputer().getM_ItemId(),TheWarehouseFunction.getFirstComputer().getM_NextComputer().getM_ItemId());
        assertEquals(TheWarehouse.getFirstComputer().getM_NextComputer().getM_NextComputer().getM_ItemId(),TheWarehouseFunction.getFirstComputer().getM_NextComputer().getM_NextComputer().getM_ItemId());
        assertEquals(Computer2,Result);
    }

    @Test
    void searchComputer() {

        //Create Objects
        Warehouse TheWarehouse = new Warehouse();
        Computer Computer1 = new Computer();
        Computer Computer2 = new Computer();
        Computer Computer3 = new Computer();
        Computer Result = new Computer();

        //Give them values
        int ElementToSearch = 5;

        Computer1.setM_ItemId(4);
        Computer1.getM_ItemId();
        Computer2.setM_ItemId(5);
        Computer2.getM_ItemId();
        Computer3.setM_ItemId(6);
        Computer3.getM_ItemId();

        TheWarehouse.getFirstComputer().setM_NextComputer(Computer1);
        TheWarehouse.getFirstComputer().getM_NextComputer().setM_NextComputer(Computer2);
        TheWarehouse.getFirstComputer().getM_NextComputer().getM_NextComputer().setM_NextComputer(Computer3);

        Result= WarehouseFunctions.searchComputer(TheWarehouse, ElementToSearch);

        assertEquals(Computer2.getM_ItemId(), Result.getM_ItemId());

    }

}