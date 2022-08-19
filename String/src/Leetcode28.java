public class Leetcode28 {
    public static int strStr(String haystack, String needle) {
        StringBuilder h = new StringBuilder(haystack);
        int index = -1;
        if(index<h.indexOf(needle)) {
            return h.indexOf(needle);
        }
        else return -1;

    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "e";
        System.out.println(strStr(haystack,needle));
    }
}
