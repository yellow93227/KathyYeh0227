import java.util.Scanner;

public class ExamAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        int sum = 0, validCount = 0;

        System.out.println("請輸入 5 個成績:");
        for (int i = 0; i < 5; i++) {
            scores[i] = scanner.nextInt();
            if (scores[i] > 0) { 
                sum += scores[i];
                validCount++;
            }
        }

        double average = (validCount > 0) ? (double) sum / validCount : 0;
        System.out.println("有效人數: " + validCount);
        System.out.printf("平均分數: %.2f\n", average);
        
        scanner.close();
    }
}