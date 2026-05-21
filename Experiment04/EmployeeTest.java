abstract class Employee {

  String name;
  int id;

  Employee(String name, int id) {
    this.name = name;
    this.id = id;
  }

  abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {

  double monthlySalary;

  FullTimeEmployee(String name, int id, double salary) {
    super(name, id);
    monthlySalary = salary;
  }

  double calculateSalary() {
    return monthlySalary;
  }
}

class PartTimeEmployee extends Employee {

  double hourlyRate;
  int hoursWorked;

  PartTimeEmployee(String name, int id, double rate, int hours) {
    super(name, id);
    hourlyRate = rate;
    hoursWorked = hours;
  }

  double calculateSalary() {
    return hourlyRate * hoursWorked;
  }
}

public class EmployeeTest {

  public static void main(String[] args) {
    Employee[] emp = {
      new FullTimeEmployee("John", 1, 5000),
      new PartTimeEmployee("Alice", 2, 20, 80),
    };

    for (Employee e : emp) {
      System.out.println(e.name + " Salary: " + e.calculateSalary());
    }
  }
}
