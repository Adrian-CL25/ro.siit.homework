package homework2.ex10;
/*
10. Write a method that checks if the array is square (i.e. every row has the same length as a itself).
public static boolean isSquare(int[][] array)
 */
public class Ex10 {


    public static void displaySquare() {
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        if (isSquare(array1)) {
            System.out.println("It is square!");
        }else{
            System.out.println("It isn't square!");
        }
    }


    public static boolean isSquare(int[][] array1) {
        for (int i = 0, l = array1.length; i < l; i++) {
            if (array1[i].length != l) {
                return false;
            }
        }
        return true;
    }
}

