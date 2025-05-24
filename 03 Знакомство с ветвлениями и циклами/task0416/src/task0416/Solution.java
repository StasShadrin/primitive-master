package task0416;

import java.util.Scanner;

/* 
Переходим дорогу вслепую
Работа светофора для пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты - жёлтый,
а потом в течение одной минуты - красный,
затем опять зелёный горит три минуты и т.д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зелёный" - если горит зелёный цвет,
"жёлтый" - если горит жёлтый цвет,
"красный" - если горит красный цвет.

Пример для числа 2.5:
зелёный

Пример для числа 3:
жёлтый

Пример для числа 4:
красный

Пример для числа 5:
зелёный


Requirements:
1. Программа должна считывать вещественное число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если горит зелёный цвет, необходимо вывести текст: "зелёный"
4. Если горит жёлтый цвет, необходимо вывести текст: "жёлтый"
5. Если горит красный цвет, необходимо вывести текст: "красный"
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        sc.close();
        System.out.println(getTrafficLightColor(number));
    }

    public static String getTrafficLightColor(Double number) {
        int minutesInHour = 60;
        int minutesFromInterval = 5;

        double byTheHour = number % minutesInHour;
        double byTheMinute = byTheHour % minutesFromInterval;

        String color;
        if (0 <= byTheMinute && byTheMinute < 3) {
            color = "зелёный";
        } else if (3 <= byTheMinute && byTheMinute < 4) {
            color = "жёлтый";
        } else {
            color = "красный";
        }

        return color;
    }
}