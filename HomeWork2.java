/**
 * Java 1. Homework 2
 *
 * @author Roman Chovgun
 * @version 28.03.2022
 */

public class HomeWork2 {
    public static void main(String args[]) {
        System.out.println(sumInterval(5,5));
        System.out.println(positiveOrNegative(-5));
        System.out.println(trueIsNotTrue(0));
        lineNumber(5, "HomeWork2");
        System.out.println(isYearLeap(3));
    }

    static boolean sumInterval(int a, int b) {
        return a + b >=10 && a + b <=20;
    }

    static String positiveOrNegative(int a) {
        return a >=0? "positive" : "negative";
    }

    static boolean trueIsNotTrue(int a) {
        return a < 0;
    }

    static void lineNumber(int a, String b) {
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
    }

    static boolean isYearLeap(int a) {
        return (a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0);
    }
}
