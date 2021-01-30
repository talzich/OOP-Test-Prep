package Design_Patterns.Composite;

import java.util.ArrayList;

/**
 * @author tal.zichlinsky
 * This class represents the composite element in a composite design pattern.
 * This object is able to store a list of objects of this class that might be
 * SuperEmployees or Employees.
 */
public class SuperEmployee extends EmployeeComponent{

    private ArrayList<EmployeeComponent> empComps;

    private String name, department, title;

    // Lazy initialization
    public SuperEmployee(String name, String department, String title){
        empComps = new ArrayList<>();
        this.name = name;
        this.department = department;
        this.title = title;
    }

    /**
     * Adds an employee component to this list
     * @param empComp - the employeeComponent we want to add
     */
    @Override
    public void add(EmployeeComponent empComp) {
        empComps.add(empComp);
    }

    /**
     * Removes an employee component from this list
     * @param empComp - the employeeComponent we want to remove
     * @return empComp - the employeeComponent removed
     */
    @Override
    public EmployeeComponent remove(EmployeeComponent empComp) {
        EmployeeComponent removed = empComps.get(empComps.indexOf(empComp));
        empComps.remove(empComp);
        return removed;
    }

    /**
     * Prints this empComp data and all of its children's data.
     */
    @Override
    public void displayEmployeeData() {
        System.out.println("Title: " +this.title +"\n\t Department: " +this.department +"\n\t Name: " + this.name);
        for(EmployeeComponent employeeComponent :  empComps){
            employeeComponent.displayEmployeeData();
        }
    }
}
