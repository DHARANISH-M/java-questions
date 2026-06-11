// You are using Java
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int[] arr=new int[num];
        for(int i=0; i<num;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<num;i++){
            int count=0;
            for(int j=0;j<num;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                map.put(arr[i],count);
            }
        }
        for(Map.Entry<Integer,Integer> n:map.entrySet()){
            System.out.print(n.getKey()+" "+n.getValue());
        }
    }
}