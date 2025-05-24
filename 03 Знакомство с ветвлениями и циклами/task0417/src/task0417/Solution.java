package task0417;

import java.util.Scanner;

/* 
Существует ли пара?
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2

Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести числа на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        int numberThree = sc.nextInt();
        sc.close();
        System.out.println(checkPair(numberOne, numberTwo, numberThree));
    }

    public static String checkPair(int numberOne, int numberTwo, int numberThree) {
        if (numberOne == numberTwo && numberOne == numberThree) {
            return numberOne + " " + numberTwo + " " + numberThree;
        } else if (numberOne == numberTwo) {
            return numberOne + " " + numberTwo;
        } else if (numberOne == numberThree) {
            return numberOne + " " + numberThree;
        } else if (numberTwo == numberThree) {
            return numberTwo + " " + numberThree;
        }
        return "";
    }
}
