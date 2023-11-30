public class Lecturer extends Person {
    private Object employeeID;
    private String department;

    public Lecturer(String name,int age,Object employeeID,String department){
        super(name,age);
        this.employeeID=employeeID;
        this.department=department;
    }
    private  Object getEmployeeID(){
        return employeeID;
    }
    private void setEmployeeID(Object employeeID){
        this.employeeID=employeeID;
    }
    private String getDepartment(){
        return department;
    }
    private void setDepartment(String department){
        this.department=department;
    }
}
