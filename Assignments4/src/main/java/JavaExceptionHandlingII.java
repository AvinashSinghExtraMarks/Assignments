import java.util.Scanner;

public class JavaExceptionHandlingII {
    public static void main(String[] args) {
        MyCalculator cal = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        try {
            System.out.println(cal.power(n, p));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class MyCalculator {
    long power(int n, int p) throws Exception {
        if(n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}