package Lesson1.Task1;
import java.util.Arrays;
//Написать метод, который меняет два элемента массива
// местами.(массив может быть любого ссылочного типа);

public class Main {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E", "F", "G"};
        System.out.println(Arrays.toString(arr));
        swapElements(arr, 0,4);
        System.out.println(Arrays.toString(arr));
    }
    private static <T> void swapElements(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
