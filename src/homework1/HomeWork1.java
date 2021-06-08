package homework1;


public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 1, b = -2, c = a + b;
        if (c >= 0) System.out.println("Сумма положительная");
        if (c < 0) System.out.println("Сумма отрицательная");
    }

    public static void  printColor() {
        int value = 80;
        if (value <= 0) System.out.println("Красный");
        if (value >= 100) System.out.println("Зеленый");
        else System.out.println("Желтый");
    }

    public static void compareNumbers() {
        int a = 4, b = 3;
        if (a >= b) System.out.println ("a >= b");
        else System.out.println("a < b");
    }

}


