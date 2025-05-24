package task0419;

import java.util.Scanner;

/* 
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран максимальное из четырёх чисел.
4. Если максимальных чисел несколько, необходимо вывести любое из них.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        int numberThree = sc.nextInt();
        int numberFour = sc.nextInt();
        sc.close();
        System.out.println(getMaxOfFour(numberOne, numberTwo, numberThree, numberFour));
    }

    public static int getMaxOfFour(int numberOne, int numberTwo, int numberThree, int numberFour) {

        return Math.max(Math.max(numberOne, numberTwo), Math.max(numberThree, numberFour));
    }
}
