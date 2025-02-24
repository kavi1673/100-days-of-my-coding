package Qns;

public class primeIseven {
    public static void main(String[] args) {
        // Print prime numbers up to 1000 with even or odd indication
            for (int i = 0; i <= 1000; i++) {
                if (isPrime(i)) {
                    System.out.print("("+ i + " ");
                    if (Iseven(i)) {
                        System.out.println("even )");
                    } else {
                        System.out.println("odd )");
                    }
//                    System.out.println();
                }
            }
    }

            static boolean isPrime(int n) {
                if (n <= 1) {
                    return false;
                }
                int a = 2; // Starts from 2 to count the factors of n
                while (a * a <= n) {
                    if (n % a == 0) {
                        return false;
                    }
                    a++;
                }
                return a * a > n;
            }

            static boolean Iseven(int n) {
                return n % 2 == 0;
            }
}



