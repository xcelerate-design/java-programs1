package exam;

/**
 * @author Xcelerate Design on 2023-07-13
 * @project java-programs
 */

public class Fibonacci {
    public static void main(String[] args) {
            int a = 0;
            int b = 1;
            int sum;
            System.out.print(a + " " +b + " ");
            for(int i =0 ; i<10 ;i++){
                sum = a+b;
                System.out.print(sum + " ");
                a = b;
                b = sum;
            }
    }
}
