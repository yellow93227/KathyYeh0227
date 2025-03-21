package LottoDemo;
import java.util.Random;
public class Lotto {
    public static void main(String[] args) {
    	//建立Random類別物件random來產生亂數
        Random random = new Random();
        //使用numbers陣列來記錄產生的6個號碼
        int[] numbers = new int[6];
        
        System.out.print("大樂透號碼：");
        //產生1到49之間的亂數，確保每個號碼只出現一次
        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(49) + 1;
            for (int j = 0; j < i; j++) {
                if (numbers[j] == num) {
                    num = random.nextInt(49) + 1;
                    j = -1;
                }
            }
            numbers[i] = num;
            System.out.print(num + " ");
        }
    }
}