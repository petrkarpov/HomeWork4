package NumbersGame;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Впишите два числа: ");
        int numNumNum = n.nextInt();
        int result = n.nextInt();
        System.out.println("Результирующий счет: " + result);


        Nummm(numNumNum, result);

    }

    public static void Nummm(int numNumNum, int result) {
        List<Integer> numNum = Arrays.asList(1, 2, 3, 4, 8, 1, 9, 0, 5, 3);
        int i = 9;
        i++;
        {
            numNum.add(i);
        }
        numNum.remove(9);
        System.out.println(result);

    }
}