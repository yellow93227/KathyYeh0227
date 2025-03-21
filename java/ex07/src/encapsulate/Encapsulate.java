package encapsulate;             //宣告程式檔的類別置於encapsulate套件內

class Rectangle {               //矩形類別
    private double high, wide;           //宣告高度,寬度屬性
    private double area = 0, peri = 0;   //建立面積,周長屬性

    private void calArea() {     //計算面積的方法
        area = high * wide;
    }

    private void calPeri() {    //計算周長的方法
        peri = (high + wide) * 2;
    }

    public void setValue(double h, double w) {    //傳入引數
        high = h;
        wide = w;
        calArea();
        calPeri();
    }
    
    public double getArea() {
        return area;          //傳出面積資料
    }

    public double getPeri() {
        return peri;          //傳出周長資料
    }
}

public class Encapsulate {                          //主類別
    public static void main(String[] args) {        //主程式
	    Rectangle rec2 = new Rectangle();         //宣告rec2物件
	    double h2 = 30;
	    double w2 = 15.5;
	    rec2.setValue(h2, w2);                     //設定rec2物件高度,寬度的屬性值
	    System.out.println("*** 矩形物件rec2 ***");
	    System.out.println("長度 = " + h2);
	    System.out.println("寬度 = " + w2);
	    System.out.println("面積 = " + rec2.getArea());     //取得面積傳回值
	    System.out.println("周長 = " + rec2.getPeri());     //取得周長傳回值
    }
}
