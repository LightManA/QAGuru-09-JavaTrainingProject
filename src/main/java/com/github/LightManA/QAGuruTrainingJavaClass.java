package com.github.LightManA;

public class QAGuruTrainingJavaClass {

    // примитивные типы данных
    boolean aBoolean = true; // * тип данных который обычно используется
    char aChar = '$';
    byte aByte = 1;
    short aShort = 1;
    int aInt = 1; // * тип данных который обычно используется
    long aLong = 1L;
    float aFloat = 1.0F;
    double aDouble = 1.0D; // * тип данных который обычно используется (но реже)

    // Структура данных

    static class Human {   // создали новый тип данных "Человек"
        int age; // дефолтное значение - 0
        String name; // дефолтное значение - null

        public void sayName() {
            System.out.println(name);
        }

        public void sayAge() {
            System.out.println(age);
        }

        public void incrementAge() {
           age = age + 1;
        }

    }

    // модификатор доступа || static/не static || возвращаемое значение || имя метода || входящие аргументы
    public static void main(String[] args) {
        int age = 10;
        String message = "Hello, World !";

        Human dima = new Human();
        dima.name = "Дима";
        dima.age = 32;
        dima.sayName();

        Human alex = new Human();
        alex.name = "Алехандро";
        alex.age = 32;
        alex.sayName();

        dima.incrementAge();
        dima.sayAge();
        alex.sayAge();

        //System.out.println(message);
        //System.out.println(dima.name);
        //System.out.println(dima.age);

    }
}
