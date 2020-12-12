package homework1.tema1;

import java.util.Arrays;

/*
 Display the smallest number from an array of numbers (2 versions: with normal for and with foreach)
 */
public class Ex2 {
    /*
    With normal for
     */
//    public static void main(String[] args) {
//        int[] arr ={ 5 , 7 , 1 , 10 , 2};
//        int min = arr[0];
//        for( int i = 1; i < arr.length;i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//
//        }
//        System.out.println("Smallest number from " + Arrays.toString(arr) + " is " + min + ".");
//
//    }

/*
With foreach
 */
    public static void main(String[] args) {
        int[] arr ={ 5 , 7 , 1 , 10 , 2};
        int min = arr[0];
        for (int i:arr) {
            if(i < min){
                min = i;

        }

        }
        System.out.println("Smallest number from " + Arrays.toString(arr) + " is " + min + ".");

    }
}
