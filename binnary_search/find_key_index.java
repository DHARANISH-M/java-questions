// You are using Java
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        
        int t=obj.nextInt();
        int out=binary(n,arr,t);
        System.out.print(out);
        
    }
    static int binary(int n, int[] arr,int t){
        for(int i=0;i<n;i++){
            if(arr[i]==t){
                return i;
            }
        } return -1;
    }
}