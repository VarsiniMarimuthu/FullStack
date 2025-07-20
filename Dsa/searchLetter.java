class searchLetter{
     public static void main(String[] args){
        String name = "Varshu";
        char target = 'u';
        System.out.println(findChar(name,target));
    }
    static boolean findChar(String name, char target){
        if(name.length() == 0)
        return false;
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}