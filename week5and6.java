import java.util.Scanner;

public class week5and6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Enter number: ");
        number = sc.nextInt();

        int[] table = new int[10];

        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
    }
}