public class Member {
    private String id;
    private int balance;
    private int count = 0;
    private Product product1;

    public Member(String id) {
        this.id = id;
    }

    public void chargeMoney(int balance) {
        this.balance = balance;
    }

    public void buy(Product product) {
        if(balance > product.acount) {
            count += 1;
            balance -= (int)(product.acount*0.9);
            product1 = product;
        }
    }
    @Override
    public String toString() {
        return "회원ID:" + id+"\n잔고:"+balance+"\n거래횟수:"+count+"\n최근구매상품:["+product1+"]";
    }
}
