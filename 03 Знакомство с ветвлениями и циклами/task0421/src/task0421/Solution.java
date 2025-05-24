package task0421;

import java.util.Scanner;

/* 
Настя или Настя?
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.


Requirements:
1. Программа должна считывать две строки c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если имена одинаковые вывести сообщение "Имена идентичны"
4. Если имена разные, но их длины равны, вывести сообщение "Длины имен равны"
5. Если имена и длины имен разные - ничего не выводить.*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameOne = sc.nextLine();
        String nameTwo = sc.nextLine();
        sc.close();

        System.out.println(compareNames(nameOne, nameTwo));
    }

    public static String compareNames(String nameOne, String nameTwo) {
        if (nameOne.equals(nameTwo)) {
            return "Имена идентичны";
        } else if (nameOne.length() == nameTwo.length()) {
            return "Длины имен равны";
        } else {
            return "";
        }
    }
}