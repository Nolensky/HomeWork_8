import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int [] integerNumbers = new  int[3];
        integerNumbers[0] = 1;
        integerNumbers[1] = 2;
        integerNumbers[2] = 3;
        double [] doubleNumbers = {1.57, 7.654, 9.986};
        char[] symbols = {'a', 'b', 'c'};

        System.out.println("Задача 2");
        System.out.println(integerNumbers[0] + ", " + integerNumbers[1] + ", " + integerNumbers[2]);
        System.out.println(doubleNumbers[0] + ", " + doubleNumbers[1] + ", " + doubleNumbers[2]);
        System.out.println(symbols[0] + ", " + symbols[1] + ", " + symbols[2]);

        System.out.println("Задача 3");
        System.out.println(integerNumbers[2] + ", " + integerNumbers[1] + ", " + integerNumbers[0]);
        System.out.println(doubleNumbers[2] + ", " + doubleNumbers[1] + ", " + doubleNumbers[0]);
        System.out.println(symbols[2] + ", " + symbols[1] + ", " + symbols[0]);

        System.out.println("Задача 4");
        int[] intNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < intNumbers.length; i++) {
            if(intNumbers[i] % 2 == 0){
                continue;
            } else {
                intNumbers[i]++;}
        }
        System.out.println(Arrays.toString(intNumbers));
    }
}