class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    double calculateBonus() {
        return salary * 0.10;
    }

    void performanceReport() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println();
    }

    void manageProject() {
        System.out.println(name + " is working on a project.\n");
    }
}

class Manager extends Employee {
    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }
    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }
    double calculateBonus() {
        return salary * 0.15;
    }
}

class Programmer extends Employee {
    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }
    double calculateBonus() {
        return salary * 0.12;
    }
}

public class dev{
    public static void main(String[] args) {
        Manager m = new Manager("chinmay", "kop", 50000);  
        Developer d = new Developer("anurag", "up", 40000); 
        Programmer p = new Programmer("chetan", "ngp", 35000);

        m.performanceReport();
        m.manageProject();

        d.performanceReport();
        d.manageProject();

        p.performanceReport();
        p.manageProject();
    }
}
