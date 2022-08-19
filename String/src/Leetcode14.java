public class Leetcode14 {
    public static String longestCommonPrefix(String[] strs) {
        String str="";
        int count = 0;
        int min = Integer.MAX_VALUE;
        //This loop for check the string of minimum length in the Array.
        int i = 0;
        while (i < strs.length) {
            int len = strs[i].length();
            if (len < min) {
                min = len;
                str = strs[i];
            }
            i++;
        }

        for(i=0;i<min;i++) {
            for (String s : strs) {
                char[] ch = s.toCharArray();
                if (str.charAt(i) != ch[i]) {
                    return str.substring(0, count);
                }
            }
            count++;
        }
        return str.substring(0,count);

    }

    public static void main(String[] args) {
        String[] str = {"cir","car"};
        System.out.println(longestCommonPrefix(str));
    }

}
