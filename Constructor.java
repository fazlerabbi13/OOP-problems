
class Employee{
    String name;
    int id;
    int salary;

    public Employee(String name,int id){
        this.name=name;
        this.id=id;
    }

     public Employee(String name,int id,int salary) {
        this.name=name;
        this.id=id; 
        this.salary=salary;
    }

    public void displayDetails(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);

    }
    
}

public class Constructor {
    public static void main(String[] args) {
        Employee em1 = new Employee("Rabbi", 123);
        Employee em2 = new Employee("Mohammad",101,50000);

        em1.displayDetails();
        em2.displayDetails();
    }
}
