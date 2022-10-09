/*Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу. Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.

        Пример для теста работы программы:

        - Курс доллара: 67,55
        - Количество рублей: 1000
        - Итого: 14,80 долларов*/

package com.max.idea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Курс доллара: ");
        double dollar = in.nextDouble();

        System.out.print("Количество рублей: ");
        double rub = in.nextDouble();

        double result = rub/dollar; //найти количество долларов в рублях
        System.out.printf("Итого: %.2f",(double)(Math.round(result*100))/100); //округлить до 2х знаков после запятой и вывести


    }
}