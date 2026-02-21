import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input integer
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Input float
        System.out.print("Enter a float: ");
        float f = sc.nextFloat();

        // Input character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Clear buffer before string input
        sc.nextLine();

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Output
        System.out.println("\n--- Output ---");
        System.out.println("Integer: " + num);
        System.out.println("Float: " + f);
        System.out.println("Character: " + ch);
        System.out.println("String: " + str);

        sc.close();
    }
}