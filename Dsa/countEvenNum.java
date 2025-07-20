class countEvenNum{
    public static void main(String[] args){
        int[] arr = {2,4,2489,6,8,10};
        System.out.print(checkNum(arr));
    }
    static int checkNum(int[] arr){
        int count = 0;
        for(int num : arr){
        if(even(num)){
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