class majorityElement{
    public static void main(String[] args){
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majority(arr));
    }
    static int majority(int[] arr){
        int index = 0;
        int count = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[index]){
                count++;
            }
            else{
                count--;
                if(count == 0){
                    index = i;
                    count = 1;
                }
            }
        }
        count = 1;
        for(int num: arr){
            if(num == arr[index]){
                count++;
            }
        }
        return arr[index];
    }
}