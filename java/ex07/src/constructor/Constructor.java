package constructor;

class Rectangle {                          //矩形類別
    private double high = 20, wide = 10;    //初始化high,wide屬性預設值
	private double area;                //宣告面積屬性

    private void calArea() {     //計算面積的方法
	    area = high * wide;
    }
	    
	public Rectangle() {        //類別建構式,沒有傳入引數
	    calArea();
	}
	    
	public Rectangle(double h) {     //類別建構式,傳入一個引數
        high = h;
        calArea();
    }
	    	    
    public Rectangle(double h, double w) {    //類別建構式,傳入兩個引數
   	    high = h;
        wide = w;
        calArea();
    }
        
    public double getArea() {
    	System.out.printf("長度 = %.1f , 寬度 = %.1f \n", high, wide);
        return area;              //傳出面積值
    }
}
	
public class Constructor {                     //主類別
    public static void main(String[] args) {   //主程式
        System.out.println("矩形一");
        Rectangle rec1 = new Rectangle();    // 使用沒有引數的建構式  
        System.out.printf("矩形面積 = %.1f", rec1.getArea());    
	    
	    System.out.println("\n\n矩形二");
        Rectangle rec2 = new Rectangle(25.3);     //使用一個引數的建構式
        System.out.printf("矩形面積 = %.1f", rec2.getArea());    
        
        System.out.println("\n\n矩形三");
        Rectangle rec3 = new Rectangle(25.3, 12);     //使用二個引數的建構式
        System.out.printf("矩形面積 = %.1f", rec3.getArea());     
    }
}
