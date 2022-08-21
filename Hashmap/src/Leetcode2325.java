import java.util.*;

public class Leetcode2325 {
    public static String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();

        int n = key.length();

        char c  = 'a';

        for(int i=0;i<n;i++)
        {
            char ch = key.charAt(i);
            if(ch==' ')
            {
                continue;
            }
            if(!map.containsKey(ch))
            {
                map.put(ch,c);
                c = (char)(c+1);
            }
        }

        StringBuilder ans = new StringBuilder();

        int m = message.length();

        for(int i=0;i<m;i++)
        {
            char ch = message.charAt(i);

            if(ch==' ')
            {
                ans.append(" ");
            }
            else
                ans.append(map.get(ch));
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        System.out.println(decodeMessage(key,message));

    }
}
