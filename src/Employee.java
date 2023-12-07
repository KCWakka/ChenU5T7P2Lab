public class Employee {
    private static int mostRecentEmployeeID = 0;
    private static int totalEmployeesCreated = 0;
    private String employeeFirstName;
    private String employeeLastName;
    private int employeeID;
    public Employee (String first, String last) {
        employeeFirstName = first;
        employeeLastName = last;
        totalEmployeesCreated++;
        if (mostRecentEmployeeID > 99) {
            mostRecentEmployeeID++;
        } else {
            mostRecentEmployeeID = 100;
        }
        employeeID = mostRecentEmployeeID;
    }
    public String getFullName() {
        return employeeFirstName + " " + employeeLastName;
    }
    public int getID() {
        return employeeID;
    }
    public static int getMostRecentEmployeeID() {
        return mostRecentEmployeeID;
    }
    public static int getTotalEmployeesCreated() {
        return totalEmployeesCreated;
    }
    public String employeeInfo() {
        String str = "";
        str += "--------------------------\n";
        str += "Employee full name: " + getFullName();
        str += "\nEmployee ID: " + getID();
        str += "\nMost recent ID assigned: " + getMostRecentEmployeeID();
        str += "\nTotal employees hired: " + getTotalEmployeesCreated();
        str += "\n--------------------------";
        return str;
    }
}
