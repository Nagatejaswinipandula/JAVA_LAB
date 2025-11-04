// Parent class
class Person {
    String name;
    int age;

    void input(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Child class
class Employee extends Person {
    double salary;

    void setSalary(double salary) {
        this.salary = salary;
    }

    void showDetails() {
        display(); // method from parent
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.input("John", 30);
        emp.setSalary(50000);
        emp.showDetails();
    }
}
