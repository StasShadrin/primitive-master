package task0420;

import java.util.Scanner;

/* 
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить три числа разделенных пробелами.
4. Программа должна выводить числа в порядке убывания.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        int numberThree = sc.nextInt();
        sc.close();

        System.out.println(sort(numberOne, numberTwo, numberThree));
    }

    public static String sort(int numberOne, int numberTwo, int numberThree) {
        int max = Math.max(numberOne, numberTwo);
        max = Math.max(max, numberThree);
        int min = Math.min(numberOne, numberTwo);
        min = Math.min(min, numberThree);
        int median = numberOne + numberTwo + numberThree - (min + max);

        return max + " " + median + " " + min;
    }
}