import java.util.*;
class hexaDecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine().trim();

        if(!binary.matches("[01]+")){
            System.out.print("Enter a valid binary number");
            return;
        }

        int decimal = Integer.parseInt(binary,2);
        String hexa = Integer.toHexString(decimal).toUpperCase();
        System.out.print(hexa);
    }
}

