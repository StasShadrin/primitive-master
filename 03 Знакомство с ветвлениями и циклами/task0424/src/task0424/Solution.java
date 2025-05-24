package task0424;

import java.util.Scanner;

/* 
Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других,
равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна использовать команды System.out.println() или System.out.print().
3. Программа должна выводить на экран порядковый номер числа, отличного от остальных.
4. Если все числа разные, ничего не выводить.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        int numberThree = sc.nextInt();
        sc.close();

        System.out.println(getDifferentNumber(numberOne, numberTwo, numberThree));
    }

    public static int getDifferentNumber(int numberOne, int numberTwo, int numberThree) {

        if ((numberOne == numberTwo && numberTwo == numberThree) ||
            (numberOne != numberTwo && numberTwo != numberThree && numberOne != numberThree)) {
            return 0;
        } else if (numberOne == numberTwo) {
            return 3;
        } else if (numberOne == numberThree) {
            return 2;
        } else {
            return 1;
        }
    }
}