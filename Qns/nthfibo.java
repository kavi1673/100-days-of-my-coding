package Qns;
import java.util.Scanner;
//fibo starting from the index 1


public class nthfibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        int count = 2;
        if (n == 1) {
            System.out.println(a);


        } else if (n == 2) {
            System.out.println(a);
        } else {
            while (n > count) {
                int temp = b;
                b = a + b;
                a = temp;
                count++;

            }
            System.out.println(b);
        }
    }
}

