package demo;

public class Customer extends Person{
    
    private String add, purchase;
    private int budget;
    
    public void setAdd(String add){
        this.add = add;
    }
    
    public void setBudget(int budget){
        this.budget = budget;
    }
    
    public void setPurchase(String purchase){
        this.purchase = purchase;
    }
    
    public String getAdd(){
        return add;
    }
    
    public int getBudget(){
        return budget;
    }
    
    public String getPurchase(){
        return purchase;
    }
}
