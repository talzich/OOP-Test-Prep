package Design_Patterns.Composite;

import java.util.ArrayList;

/**
 * This class facilitates the composite design pattern.
 * It stores all of its composites and leaves.
 */
public class Firm {

    private String name, city;
    private ArrayList<String> departments;
    private ArrayList<EmployeeComponent> employees;

    // Simple constructor
    public Firm(String name, String city){
        this.name = name;
        this.city = city;
        this.departments = new ArrayList<>();
        this.employees = new ArrayList<>();
    }
    
    public void addDepartment(String department){
        this.departments.add(department);
    }

    public void addEmployee(EmployeeComponent employeeComponent){
        this.employees.add(employeeComponent);
    }


}
