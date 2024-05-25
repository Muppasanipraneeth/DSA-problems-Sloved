import java.util.Arrays;

public class minswap {
 public static void main(String[] args) {
    int array[]={10, 19, 6, 3, 5};
    int ans=swaps(array);
    System.out.println(ans);

 }

private static int swaps(int[] array) {
int count=0;
for (int i = 0; i < array.length; i++) {
    int min=i;
    int swap=0;
for (int j = i+1; j < array.length; j++) {
    if(array[j]<array[min]){
        min=j;
        swap++;
    }
}
System.out.println(swap);
if(swap>0){
    count++;
int temp=array[min];
array[min]=array[i];
array[i]=temp;
}
}
// System.out.println(Arrays.toString(array));
return count;
}   
}
