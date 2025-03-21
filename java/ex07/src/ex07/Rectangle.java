package ex07;

public class Rectangle {        //矩形類別
    public double high, wide;    //宣告高度,寬度公有資料成員
    public double area = 0; 	 //宣告面積公有資料成員
    private double peri = 0;   	 //宣告周長私有資料成員
    
    public double getPeri(double h, double w) {    //傳出周長值的方法
	    high = h;
	    wide = w;
	    peri = (high + wide) * 2;
	    return peri;
    }
    
    public void calArea() {   //計算面積值的方法
        area = high * wide;
    }
}