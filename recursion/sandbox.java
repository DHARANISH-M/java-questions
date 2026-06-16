// You are using Java
import java.util.*;
class Main{
    static void subset(int arr[], int i, String ans){
        
        if(i==arr.length){
            if(ans.length()==0){
            System.out.println("[]");
        }else{
            System.out.println(ans);
        }return;
        }
        subset(arr,i+1,ans);
        subset(arr,i+1,ans+arr[i]+" ");
    
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        String ans ="";
        subset(arr,0,ans);
    }
}   