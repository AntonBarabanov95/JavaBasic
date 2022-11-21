package org.example;

public class HomeWork {
    public static void main(String[] args) {

        // 1-е задание. Переполнение.
        int intNumber = 2147483646;
        int intNumber1 = 10;
        intNumber = intNumber + intNumber1;
        System.out.println(intNumber);


        // 2-е задание. Вычисления комбинации разных типов данных (int и double).
        int a = 10;
        double b = 25.3;
        System.out.println(a + b);

        // 3-е задание. Логические операторы.
        int exampleNumber = 123;
        if (a % 2 == 0){
            System.out.println("Число четное");
        }
        else {
            System.out.println("Число нечетное");
        }
    }
}
