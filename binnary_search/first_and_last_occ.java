import java.util.*;
class Main{
    static int first(int arr[] , int n,int t){
        int l=0;
        int r=n-1;
        int ans=-1;
        
        while(l<=r){
            int mid=(l+r)/2;
        if(arr[mid]==t){
            ans=mid;
            r=mid-1;
        }
        else if(t<arr[mid]){
            r=mid-1;
        }else{
            l=mid+1;
        }
        }
        return ans;
    }
    static int last(int arr[] , int n,int t){
        int l=0;
        int r=n-1;
        int ans=-1;
        
        while(l<=r){
            int mid=(l+r)/2;
        if(arr[mid]==t){
            ans=mid;
            l=mid+1;
        }
        else if(t<arr[mid]){
            r=mid-1;
        }else{
            l=mid+1;
        }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int t=obj.nextInt();
        System.out.print(first(arr,n,t));
        System.out.print(last(arr,n,t));
        
    }
}