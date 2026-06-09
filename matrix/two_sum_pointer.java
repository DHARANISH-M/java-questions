// You are using Java
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int[] arr=new int[num];
        for(int i=0; i<num; i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int left=0;
        int right=num-1;
        int target=in.nextInt();
        boolean found=false;
        for(int i=0; left<right; i++){
            if(arr[left]+arr[right]==target){
                System.out.print("Done");
                found=true;
                break;
            }else if(arr[left]+arr[right]<target){
                left++;
            }else{
                right--;
            }
        }
        if(!found){
            System.out.print("Invalid");
        }
    }
}