import java.util.Scanner;

public class subb{
    public static void main(String[] args) {
    
        Scanner obj1 = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = obj1.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = obj1.nextInt();

        int difference = num1 - num2;

        System.out.println("The difference is: " + difference);

    }
}