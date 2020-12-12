package homework2.pairsSum;

public class Ex4pairsSum {
    public static void sumOfPairs(int n, int[] arr) {
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i]+ arr[j] == n){
                    System.out.println(arr[i] +"-" + arr[j]);

                }

            }

        }
    }
}
