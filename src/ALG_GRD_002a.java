import java.util.Scanner;
import java.util.Random;

public class ALG_GRD_002a {

    public static void main(String[] args) {
        int a, b, q;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number (a): ");
        a = scan.nextInt();

        while( !(a >= 1) ) {
            System.out.print("a must be >= 1: ");
            a = scan.nextInt();
        }

        System.out.print("Enter a number (b): ");
        b = scan.nextInt();

        while( !(b > a) ) {
            System.out.print("b must be > a: ");
            b = scan.nextInt();
        }

        Random rand = new Random();

        while (true) {
            q = rand.nextInt();
            if ((b-a+1) % q == 0)
                break;
        }

        int step = a;
        for (int i = a+q-1; i <= b; i += q) {
            System.out.printf("Sum from %d to %d: %d\n", step, i, computeSum(step, i));
            System.out.printf("Sum from %d to %d: %d\n\n", a, i, computeSum(a, i));
            step = i + 1;
        }

    }

    public static int computeSum(int num1, int num2) {
        int sum = 0;

        for (int i = num1; i < num2 + 1 ; i++) {
            sum += i;
        }

        return sum;
    }

}
