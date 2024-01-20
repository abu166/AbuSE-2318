public class Person implements Payable, Comparable<Person> {
    public static int counter = 1;
    private int id;
    private String name;
    private String surname;

    public Person() {
        this.id = counter++;
    }

    public Person(String name, String surname) {
        this.id = counter++;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void name(String name) {
        this.name = name;
    }

    public String surname() {
        return surname;
    }

    public void surname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", surname=" + surname + "]";
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 0.00;
    }

    @Override
    public int compareTo(Person person) {
        // Implement the comparison based on the amount of money each person makes.
        // You can access the salary field or any other relevant field to make the comparison.
        // Return a negative value if this person makes less money than the other person,
        // return a positive value if this person makes more money, and return 0 if they make the same amount.
        return 0;
    }
}