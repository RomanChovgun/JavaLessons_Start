/**
 * Java 1. Homework 1
 *
 * @author Roman Chovgun
 * @version 28.03.2022
 */

class HomeWork1 {
    public static void main(String args[]) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 2;
        int b = -3;
        System.out.println(a+b >=0? "Positive" : "Negative");
    }

    static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 2;
        int b = 1;
        System.out.println(a >= b? "a>=b" : "a<b");
    }
}