import java.util.*;

class Hello {
    public static void main(String[] args) {
    //  Scanner was missing System.in 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("First number:");
    //  int num1 = scan.nextInt();
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.println("Second number:");
        int num2 = Integer.parseInt(scan.nextLine());
    // If we don't use parentheses to quote int, the computer will think they are individual number, not calculation
        System.out.println("The sum is " + (num1 + num2));

    }
}
