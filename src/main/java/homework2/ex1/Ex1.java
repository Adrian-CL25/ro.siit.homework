package homework2.ex1;


public class Ex1 {
    public static int calculateSum(){
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
        return sum;
    }

    /***
     *
     * @param n is number that is incremented by one after each while loop;
     * @return sum of the prime numbers;
     */
    public static boolean prim(int n) {  //check param n if is prime
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
