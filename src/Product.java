public class Product {
    private String name;
    public int acount;

    public Product(String name, int acount) {
        this.name = name;
        this.acount = acount;
    }
    @Override
    public String toString(){
        return name+","+acount;
    }
}
