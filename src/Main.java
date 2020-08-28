import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Make arraylist of employees and populate with a few people
        List<Employee> employees = new ArrayList<>();
        employees.add(new Administration("Lars", "251164-6803"));
        employees.add(new Instructor("Ole", "311092-1613", 25));
        employees.add(new Administration("Henrik", "050388-1410"));
        employees.add(new Instructor("Anne-Sofie", "070891-2618", 25));

        // Make arraylist of members and populate with a few people
        List<Member> members = new ArrayList<>();
        members.add(new Member("Hans", "010971-2905", true));
        members.add(new Member("Tina", "061091-1112", true));
        members.add(new Member("Lone", "121298-0732", false));
        members.add(new Member("Niels", "170594-1937", false));

        // Print out formattet list of employees. Instanceof to differentiate between the two types of employees.
        System.out.println("Fitness employees:");
        System.out.printf("%-12s %-15s %-8s %-10s %-5s %n", "Name", "CPR", "Hours", "Salary", "Vacation");
        System.out.println("*".repeat(60));
        for (Employee e : employees) {
            if (e instanceof Administration) {
                System.out.printf("%-12s %-15s %-8d %-10d %-5d %n", e.getName(), e.getCpr(), e.getHours(), e.getSalary(), ((Administration) e).getVacation());
            }
            else {
                System.out.printf("%-12s %-15s %-8d %-10d %n", e.getName(), e.getCpr(), e.getHours(), e.getSalary());
            }
        }
        System.out.println("=".repeat(60));

        // To create some space between the outputs
        System.out.println();

        // Print out formattet list of members
        System.out.println("Fitness members:");
        System.out.printf("%-12s %-15s %-12s %-8s %n", "Name", "CPR", "Membership", "Fee");
        System.out.println("*".repeat(45));
        for (Member m : members) {
            System.out.printf("%-12s %-15s %-12s %-8d %n", m.getName(), m.getCpr(), m.getMembershipType(), m.monthlyFee());
        }
        System.out.println("=".repeat(45));

        // To create some space between the outputs
        System.out.println();

        // Create list of persons to hold both employees and members
        List<Person> allPeople = new ArrayList<>();
        allPeople.addAll(employees);
        allPeople.addAll(members);

        // Print out formattet list of all the people
        System.out.println("All fitness people:");
        System.out.printf("%-12s %-15s %n", "Name", "CPR");
        System.out.println("*".repeat(25));
        for (Person p : allPeople) {
            System.out.printf("%-12s %-15s %n", p.getName(), p.getCpr());
        }
        System.out.println("=".repeat(25));
    }
}
