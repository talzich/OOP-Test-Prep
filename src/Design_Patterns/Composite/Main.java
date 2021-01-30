package Design_Patterns.Composite;

public class Main {

    public static void main(String[] args) {
        Firm apple = new Firm("Apple", "Cupertino, California");
        apple.addDepartment("General");
        apple.addDepartment("Design");
        apple.addDepartment("R&D");
        apple.addDepartment("Engineering");

        EmployeeComponent timCook = new SuperEmployee("Tim Cook", "General", "CEO");
        EmployeeComponent johny = new SuperEmployee("Johny Ive", "Design", "VP");
        EmployeeComponent greg = new SuperEmployee("Greg Jew", "R&D", "VP");
        EmployeeComponent itay = new Employee("Itay Sharabi", "R&D", "Senior Developer");
        EmployeeComponent zich = new Employee("Tal Zich", "R&D", "Senior Developer");
        apple.addEmployee(timCook);
        apple.addEmployee(johny);
        apple.addEmployee(greg);
        apple.addEmployee(itay);
        apple.addEmployee(zich);

        timCook.add(johny);
        timCook.add(greg);

        greg.add(itay);
        greg.add(zich);

        timCook.displayEmployeeData();
    }
}
