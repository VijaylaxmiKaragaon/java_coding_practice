package Encapsulation.Employee;

public class EmployeeTest {
    public static void main(String args[]){
        Employee e = new Employee();
        e.setName("Sanjay");
        System.out.println(e.getName());
        e.setId(101);
        System.out.println(e.getId());
        e.setSalary(50000);
        System.out.println(e.getSalary());
        e.setDept("CSE");
        System.out.println(e.getDept());
    }
}
