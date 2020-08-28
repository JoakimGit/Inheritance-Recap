public class Instructor extends Employee {

    public Instructor(String name, String cpr, int hours) {
        super(name, cpr);
    }

    @Override
    public int getSalary() {
        return super.getHours() * 456;
    }
}
