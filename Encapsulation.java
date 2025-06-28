
class Employee{
    private int id;
    private String name;
    private int salary;

    // getter method
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    } 

    public int getSalary(){
        return salary;
    }

    // setter methods
    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }


    public void details(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setId(123);
        employee.setName("Rabbi");
        employee.setSalary(500000000);

        employee.details();
    }
}
