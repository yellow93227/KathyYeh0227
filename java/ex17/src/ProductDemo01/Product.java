package ProductDemo01;

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

    public static void main(String[] args) {
    	//建立Product產品陣列products，並存放五筆Product產品記錄
        Product[] products = new Product[5];
        products[0] = new Product(1, "Product A", 10.0);
        products[1] = new Product(2, "Product B", 20.0);
        products[2] = new Product(3, "Product C", 30.0);
        products[3] = new Product(4, "Product D", 40.0);
        products[4] = new Product(5, "Product E", 50.0);
        //顯示products內所有產品記錄
        for (Product p : products) {
            System.out.println(p.getId() + ", " + p.getName() + ", " + p.getPrice());
        }
    }
}
