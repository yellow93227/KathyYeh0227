public class exercise_0314_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 輸入第一個數字
        System.out.print("請輸入第一個數字: ");
        double num1 = sc.nextDouble();

        // 輸入第二個數字
        System.out.print("請輸入第二個數字: ");
        double num2 = sc.nextDouble();

        // 輸入運算符號
        System.out.print("請選擇運算符號 (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("計算結果: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("計算結果: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("計算結果: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("計算結果: " + result);
                } else {
                    System.out.println("錯誤！除數不能為 0");
                }
                break;
            default:
                System.out.println("無效的運算符號！");
        }

        sc.close();
    }
}