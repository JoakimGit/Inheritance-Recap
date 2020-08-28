public class Member extends Person {

    private boolean isBasic;

    public Member(String name, String cpr, boolean membership) {
        super(name, cpr);
        isBasic = membership;
    }

    public String getMembershipType() {
        if (isBasic) {
            return "Basic";
        }
        else {
            return "Full";
        }
    }

    public int monthlyFee() {
        if (isBasic) {
            return 199;
        }
        else {
            return 299;
        }
    }

    @Override
    public String toString() {
        return "Member{" +
                "isBasic=" + isBasic +
                ", name='" + name + '\'' +
                ", cpr='" + cpr + '\'' +
                '}';
    }
}
