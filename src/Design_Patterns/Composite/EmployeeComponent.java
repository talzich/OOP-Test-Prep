package Design_Patterns.Composite;

/**
 * @author tal.zichlinsky
 * This abstract class represents the core idea and behavior of the composite design pattern
 * It allows overriding sub classes to add and remove children and allows
 * all sub classes to implement displayEmployees()
 */
public abstract class EmployeeComponent {

    /**
     * Allows overriding classes to add children
     * @param empComp
     */
    public void add(EmployeeComponent empComp){
        throw new UnsupportedOperationException();
    }

    /**
     * Allows overriding classes to remove children
     * @param empComp
     */
    public EmployeeComponent remove(EmployeeComponent empComp){
        throw new UnsupportedOperationException();
    }

    /**
     * Display the data of the employee
     */
    public abstract void displayEmployeeData();
}
