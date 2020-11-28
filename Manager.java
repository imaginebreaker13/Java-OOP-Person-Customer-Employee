package demo;

public class Manager extends Employee{
    
    private int allowance;
    
    public void setAllowance(int allowance){
        this.allowance = allowance;
    }
    
    public int getAllowance(){
        return allowance;
    }
}
