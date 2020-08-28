public class Employee extends Person {

    private int hours;
    private int salary;

    public Employee(String name, String cpr, int hours) {
        super(name, cpr);
        hours = hours;
        salary = salary;
    }

    public Employee(String name, String cpr) {
        super(name, cpr);
        hours = 37;
        salary = 23000;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
