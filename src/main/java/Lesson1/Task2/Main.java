package Lesson1.Task2;
//Написать метод, который преобразует массив в ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E", "F", "G"};
        ArrayList<String> list = convertToList(arr);
        System.out.println(list.getClass() + ": " + list);
    }
    public static <T> ArrayList<T> convertToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
