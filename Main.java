package Lesson6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(arrAfterFour(new int[]{1,1,2,4,1,1,1,1})));
//        System.out.println(Arrays.toString(arrAfterFour(new int[]{1,1,2,3,3,5,6})));
//        System.out.println(Arrays.toString(arrAfterFour(new int[]{4,5,5,5,5})));

        System.out.println(arrOneAndFour(new int []{2,3,5,6,7}));
        System.out.println(arrOneAndFour(new int []{1,2,3,5,8}));
        System.out.println(arrOneAndFour(new int []{1,1,4,4}));

    }

    public static int[] arrAfterFour(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }
        }
        throw new RuntimeException("Массив без 4");
    }
    public static boolean arrOneAndFour(int[] arr) {
        boolean has1 = false;
        boolean has4 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                return false;
            }
            if (arr[i] == 1) {
                has1 = true;
            }
            if (arr[i] == 4) {
                has4 = true;
            }
        }
        return has1 && has4;
    }
}