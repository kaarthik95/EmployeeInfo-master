package sg.edu.rp.c346.employeeinfo;

/**
 * Created by 16043850 on 7/13/2018.
 */

public class EmployeeList {

    public EmployeeList(String EmployeeName, String title , String salary) {
        this.EmployeeName = EmployeeName;
        this.title = title;
        this.salary = salary;
    }


    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    private String EmployeeName;
    private String title;
    private String salary;


    @Override
    public String toString() {
        return "EmployeeList{" +
                "EmployeeName='" + EmployeeName + '\'' +
                ", title='" + title + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}