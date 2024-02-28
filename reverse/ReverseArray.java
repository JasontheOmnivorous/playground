package reverse;

import java.util.ArrayList;
import java.util.Scanner;

class Reverse {
    ArrayList<Integer> arrList = new ArrayList<>();

    Reverse(int[] arr) {
        for (int num : arr) {
            this.arrList.add(num);
        }
    }

    public int[] reverser() {
        int[] array = new int[arrList.size()];

        for (int i = 0; i < arrList.size(); i++) {
            array[i] = arrList.get(i);
        }

        int[] reversed = new int[arrList.size()];

        for (int i = array.length - 1, j = 0; j < reversed.length; i--, j++) {
            reversed[j] = array[i];
        }

        return reversed;
    }
}

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Please enter the array elements: ");
        int[] inputArr = new int[size];
        for (int i = 0; i < size; i++) {
            inputArr[i] = sc.nextInt();
        }

        sc.close();

        Reverse reverse = new Reverse(inputArr);
        int[] reveredArray = reverse.reverser();
        System.out.println("Reversed array: ");
        
        for (int num : reveredArray) {
            System.out.println(num + ", ");
        }
    }
}
