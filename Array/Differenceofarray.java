package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Differenceofarray {
    // problem number 2215. Find the Difference of Two Arrays
    public static void main(String[] args) {
        int []nums={1,2,3,3};
        int []nums1={1,1,2,2};
        List<List<Integer>>list=findDifference(nums,nums1);
        System.out.println(list);
    }
    public  static  List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        List<List<Integer>>ans=new ArrayList<>();

        for(int num:nums1) {
            set1.add(num);
        }
        for(int num:nums2){
            set2.add(num);
        }

        List<Integer>list=new ArrayList<>();
        for(int n:nums1){
            if(!set2.contains(n) && !list.contains(n)){
                list.add(n);
            }
        }
        ans.add(list);
        list=new ArrayList<>();
        for (int n:nums2){
            if(!set1.contains(n) && !list.contains(n)){
                list.add(n);

            }
        }
        ans.add(list);
        return  ans;
    }
}
