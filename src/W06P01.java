public class W06P01 {
    public static void main(String[] args) {
        Member member = new Member("KSM-1234");
        member.chargeMoney(30000);

        try {
            member.buy(new Product("A4(1 box)", 20000));
        }catch (Exception e) {}
        try {
            member.buy(new Product("keyboard", 10000));
        }catch (Exception e) {}
        try {
            member.buy(new Product("HDMI cable", 5000));
        }catch (Exception e) {}
        try {
            member.buy(new Product("Eraser", 1000));
        }catch (Exception e) {}
        System.out.println(member);

    }
}
