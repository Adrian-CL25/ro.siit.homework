package homework2.ex9;




public class Ex9 {
    /***
     *
     * @param newArray is the new array who contains the selected elements from the old array
     */

    public static void displayNewArray(int[] newArray) {
        for(int i = 0; i< newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
        System.out.println("\nLength of new array is " + newArray.length + ".");
    }

    public static int[] getInts(int[] temp, int count) {
        int[] newArray = new int[count];
        for(int i = 0; i< count; i++){
            newArray[i] = temp[i];
        }
        return newArray;
    }

}
