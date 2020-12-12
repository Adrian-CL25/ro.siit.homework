package homework1.tema1;

/*
1.Calculate the sum of the first 100 prime numbers.
 */
public class Ex1 {


    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int n = 2;

        while (i <= 100) {
            if (prim(n)) {
                System.out.println("No." + i + " = " +n);
                sum = sum + n;
                i++;
            }
            n++;
        }
        System.out.println("Sum of the first 100 prime numbers is: " + sum);
    }



    public static boolean prim(int n) {
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
