import java.util.*;

public class EmployeeSortBySalaryAssignment {

    private int id;
    private String name;
    private double salary;

    public EmployeeSortBySalaryAssignment(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public EmployeeSortBySalaryAssignment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeSortBySalaryAssignment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<EmployeeSortBySalaryAssignment> employees = new ArrayList<>();
        employees.add(new EmployeeSortBySalaryAssignment(101,"Rahul",67904d));
        employees.add(new EmployeeSortBySalaryAssignment(102,"Varma",40393d));
        employees.add(new EmployeeSortBySalaryAssignment(103,"Dhanush",498594d));
        employees.add(new EmployeeSortBySalaryAssignment(104,"Khaleel",934934d));

        employees.add(new EmployeeSortBySalaryAssignment(105,"Dinesh",234343d));

        employees.stream().sorted(Comparator.comparingDouble(emp->emp.getSalary())).forEach(System.out::println);



    }
}
