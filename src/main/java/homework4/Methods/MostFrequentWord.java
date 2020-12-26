package homework4.Methods;

/*
 * Given an array of strings, find the most frequent word in a given array, I mean, the string that appears the most in the array.
 * In the case of a tie, the string that is the smallest (lexicographically)is printed.

 */
public class MostFrequentWord {
    public static void main(String[] args) {
        String[] arr = {"Java" , "is", "a", "programming" , "language","Java", "is","the","best"};
        String frequent= "";
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] == arr[j]){
                    frequent = arr[i];
                }
            }
        }
        System.out.println("Most frequent word is: " + "'"+frequent+"'");

    }
}
