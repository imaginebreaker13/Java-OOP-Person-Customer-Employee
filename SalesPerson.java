package demo;

public class SalesPerson extends Employee{
    
    private int commission;
    private String takeOrder;
    
    public void setCommission(int commission){
        this.commission = commission;
    }
    
    public void setTakeOrder(String takeOrder){
        this.takeOrder = takeOrder;
    }
    
    public int getCommission(){
        return commission;
    }
    
    public String getTakeOrder(){
        return takeOrder;
    }
}
