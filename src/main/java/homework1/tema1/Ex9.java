package homework1.tema1;


import java.util.Arrays;

/*
9. Write a Java program to remove the duplicate elements of a given array and return the new length of the array.

     Sample array: [20, 20, 30, 40, 50, 50, 50]

     After removing the duplicate elements the program should return [20, 30, 40, 50] as the array without duplicates.
 */
public class Ex9 {
        public static void main(String[] args) {
            int[] arr = {20, 20, 30, 40, 50, 50, 50};
            int size = arr.length;        //aflu lungimea array ului initial

            int[] temp = new int[size];  //creez un nou array temporar de lungimea primului arr pentru a stoca valorile distincte
            int t = 0;                   //iau un index pentru a memora pozitiile lui temp array
            int count = 1;               //iau un index care numara valorie distincte
            Arrays.sort(arr);
            for( int i = 0 ; i < size-1 ; i++){ //pune toate valorile diferite din arr in temp si numara cate valori distincte count sunt
                if(arr[i] != arr[i+1]){
                    temp[t++] = arr[i];
                    count++;
                }
            }
            temp[t] = arr[size-1];              //pune si ultima valoare in array
            int[] newArray = new int[count];    //creeaza un nou array de lungime count(numarul de valori distince)
            for( int i = 0;i<count;i++){        //introduce valorile salvate in tem in noul Array
                newArray[i] = temp[i];
            }

            for(int i = 0; i<newArray.length;i++){   //afiseaza noile valori in array
                System.out.print(newArray[i] + " ");
            }
            System.out.println("\nLength of new array is " + newArray.length + ".");
        }

}
