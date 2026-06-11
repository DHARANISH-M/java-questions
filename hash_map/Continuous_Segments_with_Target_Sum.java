// You are using Java
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=obj.nextInt();
        }
        int ps=0;
        int k=obj.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        for(int i=0;i<n;i++){
            ps+=arr[i];
            if(map.containsKey(ps-k)){
                count+=map.get(ps-k);
            }
            if(map.containsKey(ps)){
                map.put(ps,map.get(ps)+1);
            }else{
                map.put(ps,1);
            }
        }System.out.println(count);
    }
}