package Polymorphism.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
		Employee e = new Employee();
		e.calculateSalary();
		e.shiftTiming();
		System.out.println("----------------");
		
		Employee e1 = new Manager();
		e1.calculateSalary();
		e1.shiftTiming();
		
		System.out.println("----------------");
		Employee e2 = new Developer();
		e2.calculateSalary();
		e2.shiftTiming();
		
		System.out.println("----------------");
		Employee e3 = new Intern();
		e3.calculateSalary();
		e3.shiftTiming();

	}
}
