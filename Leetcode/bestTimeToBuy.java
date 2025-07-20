//7,1,5,3,6,4
class bestTimeToBuy{
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.print(buyAndSell(prices));
    }
    static int buyAndSell(int[] prices){
        int profit = 0;
        int buy_price = prices[0];
        for(int i = 0; i < prices.length-1; i++){
            if(prices[i] < buy_price){
                buy_price = prices[i];
                continue;
            }
            else{
                profit = Math.max(profit, prices[i] - buy_price);
            }
        }
        return profit;
    }
}