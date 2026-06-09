// You are using Java
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int[] arr=new int[num];
        for(int i=0; i< num; i++){
            arr[i]=obj.nextInt();
        }
        int max=0;
        int sum=0;
        int k=obj.nextInt();
        for(int i=0;i<k;i++){
            sum+=arr[i];
            max=sum;
        }
        for(int i=k;i<num;i++){
            sum+=arr[i]-arr[i-k];
            max=Math.max(max,sum);
        }
        System.out.print("Maximum study hours in k consecutive days "+max);
    }
}