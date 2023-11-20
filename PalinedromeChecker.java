import java.util.*;
public class PalinedromeChecker {
    public static void main(String[] args) {
        HashMap<Character, Integer> regular = new HashMap<>();
        String temp = new String();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        temp = scan.nextLine();
        System.out.println(palindromeChecker(temp));
    }
    private static boolean palindromeChecker(String temp) {
        int length = temp.length();
        for (int i = 0; i < length/2; i++) {
            if (temp.charAt(i) != temp.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
}

