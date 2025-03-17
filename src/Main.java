import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    public static String[] products = {"Хлеб", "Яблоки", "Молоко"};
    public static int[] prices = {100, 200, 300};
    public static int[] count = new int[prices.length];

    public static void main(String[] args) {

        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + ". " + products[i] + " " + prices[i] + " руб/шт");
        }
        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            System.in
        }
    }
}