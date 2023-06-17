import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ListA = new ArrayList<>();
        System.out.println("Введите 5 строк для списка A: ");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            ListA.add(input);
        }

        System.out.println("Список A:");
        for (String a:ListA) {
            System.out.println(a);
        }

        ArrayList<String> ListB = new ArrayList<>();
        System.out.println("Введите 5 строк для списка B: ");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            ListB.add(input);
        }

        System.out.println("Список B:");
        for (String b:ListB) {
            System.out.println(b);
        }

        ArrayList<String> ListC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ListC.add(ListA.get(i));
            ListC.add(ListB.get(4 - i));
        }

        System.out.println("Список C:");
        for (String c:ListC) {
            System.out.println(c);
        }

        Collections.sort(ListC, Comparator.comparingInt(String::length));

        System.out.println("Отсортированный список C: ");
        for (String sortedListC:ListC) {
            System.out.println(sortedListC);
        }
    }
}