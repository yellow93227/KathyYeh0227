package ProductDemo02;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    //toString方法用來傳回產品id、name、price的內容
    public String toString() {
        return id + "\t" + name + "\t" + price;
    }
}