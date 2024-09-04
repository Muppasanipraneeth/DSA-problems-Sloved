
import java.util.*;

public class Permutations {

  public static void main (String args[]){
    int array[]={1,1,2};
    List<List<Integer>>list=permutaion(array);
    System.out.println(list);
  }
  public static List<List<Integer>> permutaion( int []array){
    List<List<Integer>>result=new ArrayList<>();
    List<Integer>list=new ArrayList<>();
    findAll(result,list ,array);
    return result;
  }
public static void findAll(List<List<Integer>> result, List<Integer> list,int []array) {
   if(list.size()==array.length){
    List<Integer>newList=new ArrayList<>();
    for( int i=0; i<list.size(); i++){
        newList.add(array[list.get(i)]);
    }
    if(!result.contains(newList)){
    result.add(new ArrayList<>(newList));

    }
    return;
   }else{
    for (int i = 0; i < array.length; i++) {
        if(list.contains(i)) continue;
        list.add(i);
        findAll(result, list, array);
        list.remove(list.size()-1);
        
    }
   }

}
}