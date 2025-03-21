package ProductDemo02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductGUI extends JFrame implements ActionListener {
    private JTextField idField;
    private JTextField nameField;
    private JTextField priceField;
    private JButton prevButton;
    private JButton nextButton;
    private int currentProductIndex = 0;

    private Product[] products = {
            new Product(1, "Product A", 10.0),
            new Product(2, "Product B", 20.0),
            new Product(3, "Product C", 30.0),
            new Product(4, "Product D", 40.0),
            new Product(5, "Product E", 50.0)
    };

    public ProductGUI() {
        super("Product Viewer");

        // 建立顯示idField、nameField與priceField的文字欄
        idField = new JTextField(10);
        idField.setEditable(false);
        nameField = new JTextField(10);
        nameField.setEditable(false);
        priceField = new JTextField(10);
        priceField.setEditable(false);

        // 建立巡覽每筆產品的prevButton上一筆與nextButton下一筆按鈕
        // 按下revButton上一筆與nextButton下一筆按鈕皆執行actionPerformed方法
        prevButton = new JButton("上一筆");
        prevButton.addActionListener(this);
        nextButton = new JButton("下一筆");
        nextButton.addActionListener(this);

        // 建立panel面板用來放置文字欄、按鈕與JLabel元件
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(new JLabel("編號:"));
        panel.add(idField);
        panel.add(new JLabel("品名:"));
        panel.add(nameField);
        panel.add(new JLabel("單價:"));
        panel.add(priceField);
        panel.add(prevButton);
        panel.add(nextButton);

        getContentPane().add(panel);

        showProduct(products[currentProductIndex]);

        // 指定JFrame視窗的相關屬性
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }

    //指定呈現第幾筆產品記錄
    private void showProduct(Product product) {
        idField.setText(Integer.toString(product.getId()));
        nameField.setText(product.getName());
        priceField.setText(Double.toString(product.getPrice()));
    }

    //按下一筆與下一筆鈕會執行actionPerformed方法
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == prevButton) {   //按下prevButton上一筆按鈕執行
            if (currentProductIndex > 0) {
                currentProductIndex--;
                showProduct(products[currentProductIndex]);
            }
        } else if (e.getSource() == nextButton) { //按下nextButton下一筆按鈕執行
            if (currentProductIndex < products.length - 1) {
                currentProductIndex++;
                showProduct(products[currentProductIndex]);
            }
        }
    }

    public static void main(String[] args) {
        new ProductGUI();
    }
}

