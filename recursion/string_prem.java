import java.util.*;
public class Main{
    static void permute(char[] arr, int index){
        if(index==arr.length){
            System.out.println(new String(arr));
            return;
        }
        for(int i=index;i<arr.length;i++){
            swap(arr,index,i);
            permute(arr,index+1);
            swap(arr,index,i);
        }
    }
    static void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] c=s.toCharArray();
        Arrays.sort(c);
        permute(c,0);
    }
}