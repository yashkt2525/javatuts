import java.util.Scanner;

public class Arm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int duplicate = n;
        int duplicate_2 = n;
        int sum = 0;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        while (duplicate > 0) {
            int rem = duplicate % 10;
            sum += (int) Math.pow(rem, count);
            duplicate /= 10;
        }
         if (sum == duplicate_2) {
            System.out.println("The number is ArmStrong");
        } else {
            System.out.println("The number is Not ArmStrong");
        }
    }

}
