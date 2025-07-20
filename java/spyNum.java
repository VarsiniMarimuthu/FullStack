import java.util.Scanner;
class spyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int prod = 1;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;      
            prod *= digit; 
            temp /= 10;             
        }
        if(sum == product){
             System.out.println("It is a Spy number.");
        }
        else{
            System.out.println("Not a spy number");
        }
    } 
}