class nonRepeating{
    public static void main(String[] args){
        String s = "Hello";
        System.out.print(uniqueChar(s));
    }
    static String uniqueChar(String s){
        char ch = s.toCharArray();
        int n=ch.length;
        char result[] = new char[n];
        int k=0;
        for(int i = 0;i < ch.length; i++){
            if(ch[i] != ch[i+1]){
                result[k] = ch[i];
            }
        }
        return new String(result);
    }
}