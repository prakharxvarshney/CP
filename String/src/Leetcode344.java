import java.util.Arrays;

public class Leetcode344 {
    public static void reverseString(char[] s) {
        int l=0;
        int h=s.length-1;
        while(l<h){
            char temp=s[l];
            s[l]=s[h];
            s[h]=temp;
            l++;
            h--;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
}
