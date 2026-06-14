import java.util.Scanner;

public class BigNumber {

  
    public static int findBig(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();

        int biggest = findBig(a, b, c);

        System.out.println("Biggest number is: " + biggest);

    
        if (biggest == a && biggest == b && biggest == c) {
            System.out.println("All numbers are equal");
        } else if (biggest == a && biggest == b) {
            System.out.println("A and B are equal and biggest");
        } else if (biggest == a && biggest == c) {
            System.out.println("A and C are equal and biggest");
        } else if (biggest == b && biggest == c) {
            System.out.println("B and C are equal and biggest");
        }

        sc.close();
    }
}