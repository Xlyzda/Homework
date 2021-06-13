package homework2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(summ( 15, 6));
        plus(4);
        System.out.println(numb(-9));
        printCount("Hello!!!", 3);
        System.out.println(highYears(1916));
    }

    public static boolean summ(int a, int b) {
        if (a + b < 10) return false;
        else return a + b <= 20;
    }

    public static void plus(int a) {
        if (a < 0)
            System.out.println(a + " отрицательное число");
        else System.out.println(a + " положительное число");
    }

    public static boolean numb(int a) {
        return a < 0;
    }

    public static void printCount(String newLine, int counter) {
        for (int i = 0; i < counter; i++) System.out.println(newLine);

    }

    public static boolean highYears(int year) {

        if (year % 400 == 0) {
            return true;
        } else return (year % 100 != 0) && (year % 4 == 0);
    }


}