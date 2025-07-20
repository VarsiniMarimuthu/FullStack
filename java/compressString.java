import java.util.*;

class compressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        char[] ch = word.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : ch) {
            if (Character.isLetter(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        for (char c : map.keySet()) {
            System.out.print(c + "" + map.get(c));
        }
    }
}
