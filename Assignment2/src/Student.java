public class Student extends Person {
    private double gpa;

    public Student() {
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double gpa() {
        return gpa;
    }

    public void gpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student: " + getId() + ". " + name() + " " + surname() + " earns " + getPaymentAmount() + " tenge";
    }

    @Override
    public double getPaymentAmount() {
        return 0.00;
    }
}