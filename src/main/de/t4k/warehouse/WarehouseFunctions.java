package t4k.warehouse;
import t4k.computer.*;

public class WarehouseFunctions {
    Computer PC1 = new Computer();
    public void addComputer(){};
    public void delComputer(){};
    public void changeStockNumber(int newStock){
    PC1.setM_StockNumber(newStock);
    }
}
