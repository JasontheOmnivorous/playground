package checkAscending;

import java.util.ArrayList;
import java.util.Scanner;

class Checker {
    ArrayList<Integer> arr = new ArrayList<>();

    Checker(int[] arr) {
        for (int num : arr) {
            this.arr.add(num);
        }
    }

    public boolean check() {
        if (arr.size() == 1) return true;

        int[] array = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            array[i] = arr.get(i);
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) return false;
        }

        return true;
    } 
}

public class CheckAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Please enter the elements of the array: ");
        int[] inputArr = new int[size];
        for (int i = 0; i < size; i++) {
            inputArr[i] = sc.nextInt();
        }

        sc.close();

        Checker checker = new Checker(inputArr);
        System.out.println(checker.check());
    }
}
