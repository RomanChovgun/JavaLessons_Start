public class HomeWork1 {
    public static void main(String args[]) {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void checkSumSign() {
        int a = 2;
        int b = -3;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 2;
        int b = 1;
        if (a>=b){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}