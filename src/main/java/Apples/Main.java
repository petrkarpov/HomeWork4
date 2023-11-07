package Apples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = n.nextLine();
        System.out.println("Введите кол-во яблок: ");
        int numberApples = n.nextInt();

        numberAndName(name, numberApples);
    }

    public static void numberAndName(String name, int numberApples) {

        List<Integer> arrayApples = new ArrayList<>();
        for (int i = 11; i < 15; i++) {
            arrayApples.add(i);
        }
        if (numberApples >= 0 && numberApples <= 100) {
            if (numberApples % 10 == 1 && !arrayApples.contains(numberApples)) {
                System.out.println(name + " хранит " + numberApples + " яблоко");
            } else if (numberApples % 10 > 1 && numberApples % 10 < 5 && !arrayApples.contains(numberApples)) {
                System.out.println(name + " хранит " + numberApples + " яблока");
            } else {
                System.out.println(name + " хранит " + numberApples + " яблок");
            }
        } else {
            System.out.println("Введите кол-во яблок от 0 до 100");
        }
    }
}