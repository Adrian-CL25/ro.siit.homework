package homework1.tema1_extra;

public class Ex7 {
    public static void main(String[] args) {
        int[] arr = { 5, 7 , 10 , 12 , 10};
        int size = arr.length;
        double sum = 0;
        for (int i:arr) {
            sum += i;
        }
        double average = sum / size;
        System.out.println("Average value of array elements is: " + average);

    }
}
