package oblig2;

import java.util.Arrays;
import java.util.Scanner;

public class Oblig2 {
    public static void main(String [] args){
        System.out.println("Enter the required size of the array :: ");
        Scanner s = new Scanner(System.in);
        int str = s.nextInt();
        int myArray[] = new int [str];
        int sum = 0;
        System.out.println("Enter the elements of the array one by one ");

        for(int i=0; i<str; i++){
            myArray[i] = s.nextInt();
            sum = sum + myArray[i];
        }
        System.out.println("Elements of the array are: "+Arrays.toString(myArray));
        System.out.println("Sum of the elements of the array ::"+sum);

    }
}
