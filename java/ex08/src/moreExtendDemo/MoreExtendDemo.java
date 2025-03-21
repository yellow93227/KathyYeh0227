package moreExtendDemo;

class CMath {
    public void getMax(int a, int b) {
        int bigNum;
        if (a > b)
            bigNum = a;
        else
            bigNum = b;
        System.out.println(a + " 與 " + b + " 的最大數為 " + bigNum);
    }
}

class SonCMath extends CMath {          // SonCMath繼承CMath類別
    public void getFactorial(int a) {
        int ans = 1, i;
        System.out.print(a + "! = ");
        for (i = 1; i < a; i++) {
            System.out.print(i + " * ");
            ans *= i;
        }
        ans *= a;
        System.out.println(a + " = " + ans);
    }
}

class GrandSonCMath extends SonCMath {  //GrandSonCMath繼承SonCMath類別
    public void getFabonacci(int a) {
        int firstNum = 0, secondNum = 1;
        System.out.print("費氏數列：") ;
        System.out.print(firstNum + ", " + secondNum);
        int ans;
        for(int i=2; i<=a; i++) {
            ans = firstNum + secondNum;
            System.out.print(", " +ans);
            firstNum = secondNum;
            secondNum = ans;
        }
    }
}

public class MoreExtendDemo {
    public static void main(String[] args) {
        GrandSonCMath math2 = new GrandSonCMath();
        math2.getMax(15, 43);       //呼叫繼承自祖父類別的方法
        math2.getFactorial(6);      //呼叫繼承自祖父類別的方法
        math2.getFabonacci(12);     //呼叫用自已的方法
    }
}
