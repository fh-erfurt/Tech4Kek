package java.de.tech4kek.warehouse;

import de.tech4kek.common.Address;
import de.tech4kek.computer.Computer;
import de.tech4kek.computer.Computerdetails;
import de.tech4kek.computer.Manufacturer;
import de.tech4kek.warehouse.Warehouse;
import de.tech4kek.warehouse.WarehouseFunctions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarehouseFunctionsTest {

    @Test
    public void addComputer() {

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


        //Call function
        ErgPC = WarehouseFunctions.addComputer(WarehouseTest, TestDetails.getM_Description(), TestPC.getM_ItemId(), TestDetails.getM_DetailName(), TestDetails.getM_Price(), TestDetails.getM_CpuClock(), TestDetails.getM_CpuCoreAmount(),
                TestDetails.getM_CpuName(), TestDetails.getM_CpuThreadAmount(), TestDetails.getM_Gpu(), TestDetails.getM_GpuClock(), TestDetails.getM_RamName(), TestDetails.getM_RamSize(), TestDetails.getM_VramAmount(), ManufacturerTest.getM_ManPhoneNumber(),
                ManufacturerTest.getM_Agent(), ManufacturerTest.getM_ManName(), AddressTest.getM_ZIP(), AddressTest.getM_Street(), AddressTest.getM_HouseNr(), AddressTest.getM_Country(), AddressTest.getM_City());

        //Compare values

        Assertions.assertThat(TestPC.getM_ComputerDetails().getM_Description()).isEqualTo(ErgPC.getM_ComputerDetails().getM_Description());
        Assertions.assertThat(TestPC.getM_ItemId()).isEqualTo(ErgPC.getM_ItemId());
        Assertions.assertThat(TestPC.getM_ComputerDetails().getM_DetailName()).isEqualTo(ErgPC.getM_ComputerDetails().getM_DetailName());
        Assertions.assertThat(TestPC.getM_ComputerDetails().getM_Price()).isEqualTo(ErgPC.getM_ComputerDetails().getM_Price());
        Assertions.assertThat(TestPC.getM_ComputerDetails().getM_CpuClock()).isEqualTo(ErgPC.getM_ComputerDetails().getM_CpuClock());
        Assertions.assertThat(TestPC.getM_ComputerDetails().getM_CpuCoreAmount()).isEqualTo(ErgPC.getM_ComputerDetails().getM_CpuCoreAmount());
        Assertions.assertThat(TestPC.getM_ComputerDetails().getM_CpuName()).isEqualTo(ErgPC.getM_ComputerDetails().getM_CpuName());
        Assertions.assertThat(TestPC.getM_ComputerDetails().getM_CpuThreadAmount()).isEqualTo(ErgPC.getM_ComputerDetails().getM_CpuThreadAmount());
        Assertions.assertThat(TestPC.getM_ComputerDetails().getM_Gpu()).isEqualTo(ErgPC.getM_ComputerDetails().getM_Gpu());
        Assertions.assertThat(TestPC.getM_ComputerDetails().getM_GpuClock()).isEqualTo(ErgPC.getM_ComputerDetails().getM_GpuClock());
        Assertions.assertThat(TestPC.getM_ComputerDetails().getM_RamName()).isEqualTo(ErgPC.getM_ComputerDetails().getM_RamName());
        Assertions.assertThat(TestPC.getM_ComputerDetails().getM_RamSize()).isEqualTo(ErgPC.getM_ComputerDetails().getM_RamSize());
        Assertions.assertThat(TestPC.getM_ComputerDetails().getM_VramAmount()).isEqualTo(ErgPC.getM_ComputerDetails().getM_VramAmount());
        Assertions.assertThat(TestPC.getM_ManufacturerOfComputer().getM_ManPhoneNumber()).isEqualTo(ErgPC.getM_ManufacturerOfComputer().getM_ManPhoneNumber());
        Assertions.assertThat(TestPC.getM_ManufacturerOfComputer().getM_Agent()).isEqualTo(ErgPC.getM_ManufacturerOfComputer().getM_Agent());
        Assertions.assertThat(TestPC.getM_ManufacturerOfComputer().getM_ManName()).isEqualTo(ErgPC.getM_ManufacturerOfComputer().getM_ManName());
        Assertions.assertThat(TestPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_ZIP()).isEqualTo(ErgPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_ZIP());
        Assertions.assertThat(TestPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_Street()).isEqualTo(ErgPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_Street());
        Assertions.assertThat(TestPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_HouseNr()).isEqualTo(ErgPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_HouseNr());
        Assertions.assertThat(TestPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_Country()).isEqualTo(ErgPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_Country());
        Assertions.assertThat(TestPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_City()).isEqualTo(ErgPC.getM_ManufacturerOfComputer().getM_AddressOfMan().getM_City());

    }

    @Test
    public void delComputer() {

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

        Assertions.assertThat(TheWarehouse.getFirstComputer().getM_ItemId()).isEqualTo(TheWarehouseFunction.getFirstComputer().getM_ItemId());
        Assertions.assertThat(TheWarehouse.getFirstComputer().getM_NextComputer().getM_ItemId()).isEqualTo(TheWarehouseFunction.getFirstComputer().getM_NextComputer().getM_ItemId());
        Assertions.assertThat(TheWarehouse.getFirstComputer().getM_NextComputer().getM_NextComputer().getM_ItemId()).isEqualTo(Result.getM_ItemId());
        Assertions.assertThat(Computer2.getM_ItemId()).isEqualTo(TheWarehouseFunction.getFirstComputer().getM_NextComputer().getM_NextComputer().getM_ItemId());
        Assertions.assertThat(Computer2).isEqualTo(Result);

    }

    @Test
    public void searchComputer() {

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

        Assertions.assertThat(Computer2.getM_ItemId()).isEqualTo(Result.getM_ItemId());


    }

}

