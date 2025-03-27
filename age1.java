import java.util.Scanner;

public class age1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        age += 1;
        
        System.out.println("Next year, your age will be: " + age);
        

    }
}