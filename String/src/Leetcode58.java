public class Leetcode58 {
    public static int lengthOfLastWord(String s) {
        int length=0;
        //we are looking for the last word then we r going to run the loop from last
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){ //means that letter is found
                length++;
            }else{
                if(length>0) return length;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(lengthOfLastWord(s));
    }
}
