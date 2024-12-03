package gfg;

import java.util.ArrayList;

public class leaderArr {
    public static void main(String[] args) {
        int array[]={30, 10, 10, 5};
        ArrayList<Integer>ans=Findleader(array);
        System.out.println(ans);
    }
    public static  ArrayList<Integer> Findleader(int [] array){
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            int leader=array[i];

           if(isleader(array,i+1,leader)){
               ans.add(leader);
           }
        }



        return ans;
    }
    public static boolean isleader(int [] array,int index,int leader){


        for (int i = index; i < array.length; i++) {
            if(leader<array[i]){
                return false;
            }

        }
        return  true;
    }
}
