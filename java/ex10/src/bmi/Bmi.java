package bmi;

class MyException extends Exception {
	private String name;
	
	MyException(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "發生 MyException 例外 !";
	}
	
	public String getMessage() {
		return "身高資料不合理 !";
	}
	
	public String getLocalizedMessage() {
		return "必需介於140~220之間 !";
	}
	
	public void showError() {
		System.out.println(name + "的資料異常 !");
	}
}

class Body{
	private float height;
	private int weight;
	private String name;
	
	Body(String name, int weight) {
		this.name = name;
		this.weight = weight;
		System.out.println("姓名：" + name);
	}
	void setHeight(int height) throws MyException {
		if(height > 220 || height < 140)
			throw new MyException(name);
		else
			this.height = (float)(height / 100.0);
	}
	void showBMI() {
		System.out.println("BMI值：" + (weight / (height * height)) + "\n");
	}
}
public class Bmi {

	public static void main(String[] args) {
		try {
			Body b1 = new Body("Peter", 60);
			b1.setHeight(170);
			b1.showBMI();
			Body b2 = new Body("Romeo", 220);
			b2.setHeight(240);
			b2.showBMI();
		} 
		catch (MyException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			e.showError();
		}
		

	}

}
