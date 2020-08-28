public class Main {

    public static void main(String[] args) {
        Member m = new Member("Hans", "060691-2905", true);
        System.out.println(m);
        System.out.println(m.getMembershipType());
        System.out.println(m.monthlyFee());

        Administration a = new Administration("Lars", "653922-6803");
        System.out.println(a);
    }
}
