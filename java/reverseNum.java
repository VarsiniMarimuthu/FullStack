class reverseNum{
    public static void main(String[] args){
        int num=123;
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans=rem+(ans*10);
            num/=10;
        }
        System.out.print(num);
    }
}