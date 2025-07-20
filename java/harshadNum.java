import java.util.*;
class harshadNum{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans=0;
        int add = 0;
        while(num>0){
            int rem=num%10;
            num/=10;
            add=rem+num;
        }
        if(num % add == 0){
            System.out.print("It is a harshad number");
        }
     }
}