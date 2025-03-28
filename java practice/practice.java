import java.util.Scanner;

public class SumMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一個正整數 n：");
        int n = scanner.nextInt();
        scanner.close();
        
        int sum = 0;

        if (n<=0){
            System.out.println("無效的值");
        }else{
                    
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0 || i % 5 == 0)) {
                if (i % 7 == 0) {
                    continue; // 為7的倍數則跳過
                }
                sum += i;
            }
        }
        
        System.out.println("符合條件的數字總和為：" + sum);

        }

    }
}
