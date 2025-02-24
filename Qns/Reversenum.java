package Qns;

public class Reversenum {
    public static void main(String[] args) {
        int n = 56234;
        int ans =0;
        while(n>0){
            int r=n%10;
            n=n/10;
            ans = ans*10+r; // reversed digit

        }
        System.out.println(ans);
    }
}
