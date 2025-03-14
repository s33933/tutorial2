//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {

        //task1
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] elementsAtIndices1 = filterEvenIndexOddValue(arr1);
        printArray(elementsAtIndices1);
        int[] arr2 = {2, 3, 4, 5, 6, 7};
        int[] elementsAtIndices2 = filterEvenIndexOddValue(arr2);
        printArray(elementsAtIndices2);
        int[] arr3 = {7, 8, 9, 10, 11};
        int[] elementsAtIndices3 = filterEvenIndexOddValue(arr3);
        printArray(elementsAtIndices3);

        //task2
        int[] arr4 = {3, 3, 3, 2, 2};
        int dominantElement = findDominant(arr4);
        System.out.println(dominantElement);
        int[] arr5 = {1, 2, 3, 4};
        int dominantElement2 = findDominant(arr5);
        System.out.println(dominantElement2);
        int[] arr6 = {5, 5, 5, 5, 1};
        int dominantElement3 = findDominant(arr6);
        System.out.println(dominantElement3);

        //task3
        int[] arr7 = {1, 2, 3, 4, 5};
        int position = 2;
        int[] rotatedArray = rotateArray(arr7, position);
        printArray(rotatedArray);
        int[] arr8 = {1, 2, 3};
        int positions2 = 3;
        int[] rotatedArray2 = rotateArray(arr8, positions2);
        printArray(rotatedArray2);
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static int[] filterEvenIndexOddValue(int[] array) {
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < array.length; i += 2) {
            if (array[i] % 2 != 0) {
                resultList.add(array[i]);
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }

    public static int findDominant(int[] array) {
        int n = array.length;
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            if (frequencyMap.get(num) > n / 2) {
                return num;
            }
        }
            return -1;

    }

    public static int[] rotateArray(int[] array, int positions) {
        int n = array.length;
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + positions) % n;
            rotatedArray[newIndex] = array[i];
        }

        return rotatedArray;
    }
}
