// 5 5 5 10 20
public class lemonadeChange {
    public static void main(String[] args){
        int[] arr = {5,5,10,20};
        System.out.println(lemonade(arr));
    }
    static boolean lemonade(int[] arr){
        int fiveRupees = 0;
        int tenRupees = 0;
        for(int num : arr){
            if(num == 5){
                fiveRupees++;
            }
            else if(num == 10){
                if(fiveRupees <= 0) return false;
                tenRupees++;
                fiveRupees--;
            }
            else{
                if(fiveRupees >= 1 && tenRupees >= 1){
                    fiveRupees--;
                    tenRupees--;
                }
                else if(fiveRupees >= 3){
                    fiveRupees -= 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
