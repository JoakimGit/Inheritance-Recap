public class Instructor extends Employee {

    public Instructor(String name, String cpr, int hours) {
        super(name, cpr);
        setHours(hours);
        setSalary(getSalary());
    }

    @Override
    public int getSalary() {
        return getHours() * 456;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", cpr='" + cpr + '\'' +
                ", hours='" + getHours() + '\'' +
                ", salary='" + getSalary() + '\'' +
                '}';
    }
}
