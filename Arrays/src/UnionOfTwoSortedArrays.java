import java.util.*;

public class UnionOfTwoSortedArrays {
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m)
    {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> s = new HashSet<>();
        for (int i:arr1) {
            s.add(i);
        }
        for (int i:arr2) {
            s.add(i);
        }
        for(int i:s) {
            list.add(i);
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        int n=5,m=3;
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3};
        System.out.println(findUnion(arr1,arr2,n,m));
    }
}
