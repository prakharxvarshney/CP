public class Leetcode2315 {

    public static int countAsterisks(String s) {
        String [] temp = s.split("\\|");
        int cnt=0;
        for(int i=0; i<temp.length; i+=2){
            for(int j=0; j<temp[i].length(); ++j){
                if(temp[i].charAt(j) == '*')
                    cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
      String  s = "l|*e*et|c**o|*de|";
        System.out.println(countAsterisks(s));
    }
}
