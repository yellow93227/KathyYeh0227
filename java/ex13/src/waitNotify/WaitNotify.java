package waitNotify;

class Frisbee{ // 在Frisbee類別中設定飛盤物件的屬性和方法 
	private boolean isThrow = false; // 記錄飛盤是否丟出，false=未丟出
	public synchronized void throwF(int tNo) { // 丟飛盤的方法
		while (isThrow) { // 當isThrow為true就不斷執行
			try {
				wait(); // 主人進入等待狀態
			} catch (InterruptedException e) {
			}
		}
		System.out.println("丟出第 " + tNo + " 個飛盤");
		isThrow = true; // 設定飛盤為丟出
		notify(); // 呼叫小狗來接飛盤
	}
	public synchronized void accessF(int aNo) { // 接飛盤的方法
		while (!isThrow) { // 當isThrow為false就持續執行
			try {
				wait(); // 小狗進入等待狀態
			} catch (InterruptedException e) {
			}
		}
		System.out.println("接到第 " + aNo + " 個飛盤");
		isThrow = false; // 設飛盤為未丟出
		notify(); // 呼叫主人丟飛盤
	}
}

class ThrowFrisbee implements Runnable{ // ThrowFrisbee 類別實作 Runnable 介面
	Frisbee frisbee;  //建立 Frisbee 類別物件 frisbee
	
	ThrowFrisbee(Frisbee frisbee){  //建構子
		this.frisbee = frisbee;
	}
	
	public void run() {
		for(int i = 1; i <= 5; i ++) {  //在run()方法中執行丟飛盤投球5次
			frisbee.throwF(i);
		}
	}
}

class AccessFrisbee implements Runnable{ // AccessFrisbee別實作Runnable介面
	Frisbee frisbee;  // 建立 Frisbee 類別物件 frisbee
	AccessFrisbee(Frisbee frisbee){  // 建構子
		this.frisbee = frisbee;
	}
	public void run() { // 在run()方法中執行接飛盤5次 
		for(int i = 1; i <= 5; i ++) {
			frisbee.accessF(i);
		}
	}
}

public class WaitNotify {

	public static void main(String[] args) {
		Frisbee frisbee = new Frisbee();  //建立 Frisbee 類別物件 frisbee
		Thread master = new Thread(new ThrowFrisbee(frisbee));
		Thread dog = new Thread(new AccessFrisbee(frisbee));
		master.start();  //啟動 master 執行緒丟飛盤
		dog.start();  //啟動 dog 執行緒接飛盤
	}

}
