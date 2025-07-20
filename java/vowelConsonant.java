import java.util.*;
class vowelConsonant{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(s.length() != 1){
            System.out.print("Enter a single character");
            return;
        }
        
        char ch = s.charAt(0);
        if(!Character.isLetter(ch)){
            System.out.print("Enter an alphabet");
        }
        else{
            ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.print("vowel");
        }
        else{
            System.out.print("consonants");
        }
    }
    }
}