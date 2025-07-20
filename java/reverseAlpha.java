import java.util.Scanner;
class reverseAlpha{
    public static void main(String[] args){
        String s = "AB;C:D?EF/H";
        char[] ch = s.toCharArray();
        StringBuffer reverseLetter = new StringBuffer();
        
        for(char c : ch){
        if(Character.isLetter(c)){
            reverseLetter.append(c);
        }
    }
    reverseLetter.reverse();
    StringBuffer result = new StringBuffer();
    int index = 0;
    for(char c : ch){
        if(Character.isLetter(c))
        result.append(reverseLetter.charAt(index++));
        else
        result.append(c);
    }
    System.out.print(result);
    }
}