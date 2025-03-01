public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("Задание 2");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Задание 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i) ;
        }
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i) ;
        }
        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(" " + i + " ");
        }
        System.out.println(" ");
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(" " + i + " ");
        }
        int savings = 0;
        System.out.println(" ");
        System.out.println("Задание 8");
        for (int i = 1; i < 13; i++) {
            savings = savings + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей.");
        }
        double savings1 = 0;

        System.out.println("Задание 9");
        for (int i = 1; i < 13; i++) {
            savings1 = savings1 + 29000;
            savings1 = savings1+savings1 * 0.01;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings1 + " рублей.");
        }
        int result;
        System.out.println("Задание 10");
        for (int i=0;i<=10;i++){
            result=i*2;
            System.out.println("2 * "+i+" = "+result);
        }
    }
}