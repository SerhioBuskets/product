public class Product {

    private int price;
    private final String name;
    private final int bareCode;

    public Product(String name, int bareCode) {
        this.name = name;
        this.bareCode = bareCode;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getBareCode() {
        return bareCode;
    }
}
