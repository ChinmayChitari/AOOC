class Employee{
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(salary > 0){
            this.salary = salary;
        }
        else{
            this.salary = 0.0;
        }
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if(salary>0){
            this.salary = salary;
        }
        else{
            this.salary = 0.0;
        }
    }
    public double getYearlySalary() {
        return salary * 12;
    }
}
public class EmployeeTest{
    public static void main(String[] args) {
        Employee e1 = new Employee("chinmay","chitari",150000);
        Employee e2 = new Employee("anurag","dubey",1000);

        System.out.println("before raise");
        System.out.println(e1.getFirstName()+" "+e1.getLastName()+" "+e1.getYearlySalary());
        System.out.println(e2.getFirstName()+" "+e2.getLastName()+" "+e2.getYearlySalary());

        e1.setSalary(e1.getSalary()*1.1);
        e2.setSalary(e2.getSalary()*1.1);

        System.out.println("After raise");
        System.out.println(e1.getFirstName()+" "+e1.getLastName()+" "+e1.getYearlySalary());
        System.out.println(e2.getFirstName()+" "+e2.getLastName()+" "+e2.getYearlySalary());



    }
}