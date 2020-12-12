package homework2.fibonacci;
/*
Write a Java method to print the first 25 terms of the Fibonacci series (without recursion).
 */

/**
 * @author Adrian ;
 */
public class Ex2Fibonnaci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3 ;
        System.out.print(n1+" "+n2);
        for(int i =2; i<25;i++){
            n3 = n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
