import java.util.HashMap;

public class Leetcode2351 {
    public static char repeatedCharacter(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),1);
            }
            else {
                return s.charAt(i);
            }
        }
        return 'a';
    }

    public static void main(String[] args) {
        String s = "abcdd";
        System.out.println(repeatedCharacter(s));
    }
}
