package Design_Patterns.Composite;

public class Employee extends EmployeeComponent{

    private String name, title, department;

    public Employee(String name, String department, String title){
        this.name = name;
        this.department = department;
        this.title = title;
    }

    @Override
    public void displayEmployeeData() {
        System.out.println("Title: " +this.title +"\n\t Department: " +this.department +"\n\t Name: " + this.name);

    }
}
