package Qns;

public class Count {
    public static void main(String[] args) {
        // qn is to find how many time the 7 occured
        int n = 5435898;
        int count = 0;
       while(n>0) {
           int r = n % 10;
           if (r == 7) {
               count++;
           }
           n /= 10;
       }
        System.out.println(count);
    }
}
