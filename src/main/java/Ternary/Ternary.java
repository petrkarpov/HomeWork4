package Ternary;

public class Ternary {
    public static void main(String[] args) {
        int num = -5;   //ввести нужноe число для проверки
        System.out.println(convertNumber(num));
    }

    public static String convertNumber(int number) {
        // String result;
        return number > 0 ? (number % 7 < 4 ? "positive-m" : "positive-p")
                : number == 0 ? "zero" : (number % 7 > -4 ? "negative-m" : "negative-p");
    }
}