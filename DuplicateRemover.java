import java.util.*;
public class DuplicateRemover{
    Scanner scan = new Scanner(System.in);
    HashMap<Integer, Character> map = new HashMap<>();
    HashSet<Character> uniqueCharacters = new HashSet<>();
    HashMap<Integer, Character> linkedSortedMap = new HashMap<>();
    public static void main(String[] args) {
        String temp;
        DuplicateRemover m1 = new DuplicateRemover();
        System.out.println("Enter a word: ");
        temp = m1.scan.nextLine();
        for (int i = 0; i < temp.length(); i++) {
            m1.map.put(i, temp.charAt(i));
        }
        
        m1.mapSort(m1.map);
        for (Map.Entry<Integer, Character> entry : m1.linkedSortedMap.entrySet()) {
            System.out.print(entry.getValue());

        }
    }

    private void mapSort(HashMap<Integer, Character> map){
       for (Map.Entry<Integer, Character> entry : map.entrySet()) {
            char character = entry.getValue();

            if(uniqueCharacters.add(character)){
                linkedSortedMap.put(entry.getKey(), character);
            }
       }
       
        
    }
}