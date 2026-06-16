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
        int[] ans=buble(arr,n);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
    static int[] buble(int arr[],int n)
    {
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }return arr;
    }
}