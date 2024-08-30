import java.util.ArrayList;

public class RatMazewithwater {
    public static void main(String[] args) {
        int array[][]={{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        int i=array.length;
        int j=array[0].length;
        // System.out.println(i+" "+j);
        // ways("",0,0,array);
        System.out.println(waysList("", 0, 0, array));
    }public static void ways( String p,int i,int j,int [][]array){
        if(i==array.length-1 && j==array[0].length-1){
            System.out.println(p);
            return ;
        }
        if(array[i][j]==0 || i>array.length-1 || j>array[0].length-1){
            return ;
        }
        if(i<array.length-1){
            ways(p+"D", i+1, j, array);
        }
        if(j<array[0].length-1){
            ways(p+"R", i, j+1, array);
        }
    }
    public static ArrayList<String> waysList( String p,int i,int j,int [][]array){
        if(i==array.length-1 && j==array[0].length-1){
            ArrayList <String> map=new ArrayList<>();
            map.add(p);
            return map;
        }
        ArrayList<String> list=new ArrayList<>();
        if(array[i][j]==0 || i>array.length-1 || j>array[0].length-1){
            ArrayList <String> map=new ArrayList<>();
            return map;
        }
        if(i<array.length-1){
            list.addAll(waysList(p+"D", i+1, j, array));
        }
        if(j<array[0].length-1){
            list.addAll(waysList(p+"R", i, j+1, array));
        }
        return list;
    }
}
