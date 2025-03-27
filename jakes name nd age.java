import java.util.Scanner;

public class UserDetails {
    public static void main(String[] args) {
                
        String name = "Jake";
        int age = 25;

                Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your User ID: ");
        int inputId = scanner.nextInt();


        if (inputId == userId) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } else {
            System.out.println("ID does not match.");
        }

        
        scanner.close();
    }
}