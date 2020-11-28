package demo;

public class Employee extends Person{
    
    private int employeeNo, basicSal;
    
    public void setEmployeeNo(int employeeNo){
        this.employeeNo = employeeNo;
    }
    
    public void setBasicSal(int basicSal){
        this.basicSal = basicSal;
    }
    
    public int getEmployeeNo(){
        return employeeNo;
    }
    
     public int getBasicSal(){
        return basicSal;
    }
}
