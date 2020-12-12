package homework2.ex2;

public class Ex2 {

    public static int smallestNo() {
        int[] arr ={ 5 , 7 , 1 , 10 , 2};
        int min = arr[0];
        for( int i = 1; i < arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }

        }
        return min;

    }

}
