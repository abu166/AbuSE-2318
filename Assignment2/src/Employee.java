public class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    public String position() {
        return position;
    }

    public void position(String position) {
        this.position = position;
    }

    public double salary() {
        return salary;
    }

    public void salary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + getId() + ". " + name() + " " + surname() + " earns " + salary + " tenge";
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}