package org.example;

public class Main {
    public static void main(String[] args) {
        //Целый числа
        byte varByte = 1; //-128 .. 127
        short varShort = 1; //-32768 .. 32767
        int varInt = 1;
        long varLong = 1L;

        //Числа с плавающей точкой
        float varFloat = 0.0f;
        double varDouble = 0.0d;

        //Логический
        boolean varBoolean = true;

        //Символьный
        char varChar = 'c';

        String varString = "Hello world!";



        //ОПЕРАТОРЫ
        // 1. Присвоения
        int VarInt1 = 0;
        VarInt1 += 10;

        // 2. Математические + - * / % ++ --
        varInt = 4 + 7;
        VarInt1 = 7 / 4;
        varInt = 7 % 4;
        VarInt1 = ++varInt;

        // 3. Сравнения >, <, >=, <=, ==, !=

        // 4. Логические операторы &&, ||, !

    }
}