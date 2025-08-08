import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();

        int limit = (a % 2 == 0) ? a - 1 : a;

        for (int i = 0; i < limit; i++) {
            int odd = 2 * i + 1;
            System.out.print(odd);
            if (i < limit - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
