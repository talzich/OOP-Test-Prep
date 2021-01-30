package Design_Patterns.Composite;

/**
 * @author tal.zichlinsky
 * This class represents the leaf part of the composite design pattern
 * It stores the data of a single employee and implements displayEmployee()
 * from the EmployeeComponent abstract class.
 */
public class Employee extends EmployeeComponent{

    private String name, title, department;

    // A simple constructor
    public Employee(String name, String department, String title){
        this.name = name;
        this.department = department;
        this.title = title;
    }

    /**
     * From the EmployeeComponent interface
     */
    @Override
    public void displayEmployeeData() {
        System.out.println("Title: " +this.title +"\n\t Department: " +this.department +"\n\t Name: " + this.name);

    }
}
