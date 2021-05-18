package Lesson1.Task3;

import Lesson1.Task3.fruits.Apple;
import Lesson1.Task3.fruits.Orange;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple());
        Box<Apple> appleBox2 = new Box<>();
        appleBox2.add(new Apple());
        Box<Orange> orangeBox= new Box<>();
        orangeBox.add(new Orange());
        Box<Orange> orangeBox2= new Box<>();
        orangeBox2.add(new Orange());
        appleBox.transfer(appleBox2);
        float appleBoxWeight = appleBox.getWeight();
        float appleBoxWeight2 = appleBox2.getWeight();
        float orangeBoxWeight = orangeBox.getWeight();
        System.out.println("Вес первой коробки с яблоками: " + appleBoxWeight);
        System.out.println("Вес второй коробки с яблоками: " + appleBoxWeight2);
        System.out.println("Вес коробки с апельсинами: " + orangeBoxWeight);
        System.out.println("Сравнение 1-й и 2-й коробок с апельсинами: " + orangeBox.sameAmg(orangeBox2));
        System.out.println("Сравнение 2-й коробки с апельсинами и 1-й коробки с яблоками: " + orangeBox2.sameAmg(appleBox));
    }
}
