class singleNumber{
    public static void main(String[] args){
        int[] arr={4,1,2,1,2};
        int xor = 0;
        for(int i = 0; i < arr.length; i++){
            xor^= arr[i];
        }
        System.out.print(xor);
    }
}