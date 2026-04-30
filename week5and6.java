import java.util.Scanner;

public class week5and6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // Step 1: Count digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Step 2: Store digits in array
        int[] digits = new int[count];
        temp = number;
        int index = 0;

        while (temp != 0) {
            digits[index++] = temp % 10;
            temp = temp / 10;
        }

        // Step 3: Frequency array (0–9)
        int[] freq = new int[10];

        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        // Step 4: Display result
        System.out.println("\nDigit Frequencies:");

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }
    }
}