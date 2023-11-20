import java.util.*;
public class Anagramchecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String temp1;
        String temp2;
        boolean result;
        System.out.println("Enter the first string");
        temp1 = scan.nextLine();
        System.out.println("Enter the second string");
        temp2 = scan.nextLine();
        result = anagramChecker(temp1, temp2);
        System.err.println(result);

    }

    private static boolean anagramChecker(String word1, String word2){

        if (word1.length() == word2.length()) {
            Map<Character, Integer> charCountMap = new HashMap<>();
            
            for (char c : word1.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0)+ 1);
            }
            System.out.println(charCountMap);
            for (char c  : word2.toCharArray()) {
                if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
                    return false;
                }
                charCountMap.put(c, charCountMap.get(c)-1);
            }
            return true;
        }else{
            return false;
        }
    }
}
