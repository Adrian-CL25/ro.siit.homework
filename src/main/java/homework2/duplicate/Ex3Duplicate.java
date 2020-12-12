package homework2.duplicate;

public class Ex3Duplicate {

    public static void findDuplicate(String str, char[] arr) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
        }
    }


}
