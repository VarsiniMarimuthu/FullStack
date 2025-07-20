class smallLetterGTarget{
    public static void main(String[] args){
        char[] letters = {'c','d','j','f'};
        char target = 'd';
        System.out.println(smallestLetter(letters, target));
    }
    static char smallestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        int mid = start + (end - start) / 2;
        while(start <= end){
            if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}