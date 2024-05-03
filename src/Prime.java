import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Prime {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                2686722, 203515, 165234, 2919126, 4083655, 397026, 730569, 4308102, 38526543
        ));
        for (int n : numbers) {
            System.out.print(n + " = ");
            primeFactorsV1(n);
//            primeFactorsV2(n);
            System.out.print("\n");
        }
    }

    public static void primeFactorsV1(int n) {
        for (int i = 2; i <= n; i += 1) {
            if (isPrime(i)) {
                while (n % i == 0) {
                    System.out.print(i + " ");
                    n /= i;
                }
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void primeFactorsV2(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2)
            System.out.print(n);
    }

    public static void printRandomNumbers() {
        Random rand = new Random();
        for (int i = 2; i <= 100; i += 1) {
            int n = rand.nextInt(1000000);
            System.out.print(n + ", ");
        }
    }
}
