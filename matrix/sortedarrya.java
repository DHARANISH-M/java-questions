// You are using Java
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=obj.nextInt();
            }
        }
        rotate(arr,n);
        
    }   
    static void rotate(int[][] arr,int n){
        int total=n*n;
        for(int i=0;i<total-1;i++){
            for(int j=0;j<total-1;j++){
                int r1=j/n;
                int c1=j%n;
                int r2=(j+1)/n;
                int c2=(j+1)%n;
                if(arr[r1][c1]>arr[r2][c2]){
                    int temp=arr[r1][c1];
                    arr[r1][c1]=arr[r2][c2];
                    arr[r2][c2]=temp;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
        
    }
    
}