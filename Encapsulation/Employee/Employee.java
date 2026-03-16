package Encapsulation.Employee;

//create a class employee 4 variables name ,id,salary and dept achieve encapsulation
public class Employee {
    private String name;
    private int id;
    private int salary;
    private String dept;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
       return id;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }

    public void setDept(String dept){
        this.dept=dept;
    }
    public String getDept(){
        return dept;
    }
}
