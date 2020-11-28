package demo;

public class Demo {   //Main Class

    public static void main(String[] args) {
        
        Manager manager = new Manager();     
            manager.setName("Mike");
            manager.setEmployeeNo(001);
            manager.setBasicSal(30000);
            manager.setAllowance(5000);
        
        SalesPerson sales = new SalesPerson();   
            sales.setName("Howard");
            sales.setEmployeeNo(006);
            sales.setBasicSal(10000);
            sales.setCommission(2000);
            sales.setTakeOrder("On-hold");
                  
        Secretary sec = new Secretary();
            sec.setName("Jessica");
            sec.setEmployeeNo(004);
            sec.setBasicSal(15000);
            
        Customer cust = new Customer();
            cust.setName("Larry");
            cust.setAdd("28th Street Brooklin");
            cust.setBudget(5000);
            cust.setPurchase("3x packages");
            
        System.out.println("Welcome to the Office");
        System.out.println("Manager: " + manager.getName());
        System.out.println("Employee No:" + manager.getEmployeeNo());
        System.out.println("Basic Salary: $" + manager.getBasicSal());
        System.out.println("Allowance: $" + manager.getAllowance());
        System.out.println("");
        System.out.println("Sales Person: " + sales.getName());
        System.out.println("Employee No:" + sales.getEmployeeNo());
        System.out.println("Basic Salary: $" + sales.getBasicSal());
        System.out.println("Commission: $" + sales.getCommission());
        System.out.println("Take Order: " + sales.getTakeOrder());
        System.out.println("");
        System.out.println("Secratary: " + sales.getName());
        System.out.println("Employee No:" + sales.getEmployeeNo());
        System.out.println("Basic Salary: $" + manager.getBasicSal());
        System.out.println("");
        System.out.println("Customer: " + cust.getName());
        System.out.println("Address" + cust.getAdd());
        System.out.println("Budget: $" + cust.getBudget());
        System.out.println("Purchase: " + cust.getPurchase());
        
    }
    
}
