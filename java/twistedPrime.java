import java.util.*;
class twistedPrime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print(isTwistedPrime(num));
    }
    static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    static boolean isTwistedPrime(int num) {
        if (!isPrime(num)) {
            return false; 
        }
        int reversedNum = reverseNumber(num);
        return isPrime(reversedNum); 
}
}