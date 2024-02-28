package secondLargest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class FindSecondLargest {
   ArrayList<Integer> arr = new ArrayList<>();

   FindSecondLargest(int[] arr) {
    for (int num : arr) {
        this.arr.add(num);
    }
   }

   public int find() {
    if (arr.size() < 2) {
        System.out.println("Array should have at least two elements.");
        return -1;
    }

    int[] sortedArr = new int[arr.size()];

    for (int i = 0; i < arr.size(); i++) {
        sortedArr[i] = arr.get(i);
    }

    Arrays.sort(sortedArr);

    return sortedArr[sortedArr.length - 2];
   }

}

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Please enter the elements of the array: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        FindSecondLargest findSecondLargest = new FindSecondLargest(arr);
        System.out.println("The second largest element in the array is " + findSecondLargest.find());
    }
}
