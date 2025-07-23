//12 345 2 6 7896
public class countEvenDigits {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        System.out.println(checkNum(arr));
    }
    static int checkNum(int[] arr){
        int count = 0;
        for(int num : arr){
        if(checkEven(num)){
            count++;
        }
    }
        return count;
    }
    static boolean checkEven(int num){
        int numOfDigits = count(num);
        if(numOfDigits % 2 == 0){
            return true;
        }
        return false;
    }
    static int count(int num){
        int count = 0;
        while(num > 0){
            count++;
            num/=10;
        }
        return count;
    }
}
