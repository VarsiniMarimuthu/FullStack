class bestTimetobuy{
    public static void main(String[] args){
        int arr[] = {7,1,5,3,6,4};
        System.out.print(buyAndSell(arr));
    }
    static int buyAndSell(int arr[]){
        int profit = 0;
        int buy_price = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < buy_price){
                buy_price = arr[i];
                continue;
            }
            else{
            profit = Math.max(profit, arr[i] - buy_price);
            }
        }
        return profit;
    }
}