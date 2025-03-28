public class exercise_0314_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入成績 (0-100): ");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("等級: A");
        } else if (score >= 80 && score < 90) {
            System.out.println("等級: B");
        } else if (score >= 70 && score < 80) {
            System.out.println("等級: C");
        } else if (score >= 60 && score < 70) {
            System.out.println("等級: D");
        } else if (score >= 0 && score < 60) {
            System.out.println("等級: F");
        } else {
            System.out.println("輸入錯誤，請輸入 0 到 100 之間的數字！");
        }
        
        sc.close();
    }
}