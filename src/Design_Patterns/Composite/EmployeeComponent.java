package Design_Patterns.Composite;

public abstract class EmployeeComponent {

    public void add(EmployeeComponent empComp){
        throw new UnsupportedOperationException();
    }

    public EmployeeComponent remove(EmployeeComponent empComp){
        throw new UnsupportedOperationException();
    }

    public abstract void displayEmployeeData();
}
