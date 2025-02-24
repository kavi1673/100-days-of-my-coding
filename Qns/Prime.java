package Qns;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        boolean ans = isPrime(num); // directly we write sop(isPrime())
        System.out.println(ans);
// to print prime number till 1000
//        for (int i = 0; i <= 1000; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//
//
//            }
//
//        }
    }
         static boolean isPrime(int n) {
             if (n <= 1) {
                 return false;
             }
             int a = 2; //this is starts from the 2 to count the factor of the n
             while (a * a <= n) {
                 if (n % a == 0) {
                     //                System.out.println("entered number is not prime");
                     return false;

                 }
                 a++;
             }

             System.out.println(a);
             return a * a > n;  //simplified if else
         }
}
