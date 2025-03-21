package writeAppend;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class WriteAppend {
	public static void main(String[] args) {
		try {
			System.out.print("請輸入檔案路徑：");
			Scanner sn = new Scanner(System.in);
			String fpath, newdata;
			fpath = sn.nextLine();
			File f = new File(fpath);
			if (! f.exists())
				if(f.createNewFile())
					System.out.println(fpath + " 檔案建立成功!!");
			
			System.out.print("輸入新增資料：");
			newdata = sn.nextLine();
			BufferedWriter fout = 
			    new BufferedWriter(new FileWriter(fpath, true));
			fout.write(newdata);
			fout.newLine();
			fout.close();
			sn.close();
			System.out.println(fpath + " 寫檔完成\n加入 " + newdata);
		} catch (IOException e) {
			System.out.println("輸入檔案路徑有誤!!");
		}
	}
}
