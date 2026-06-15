// You are using Java
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        tower(n,'A','B','C');
    }
    static void tower(int n,char start,char help,char dest){
        if(n==0){
            return;
        }
        tower(n-1,start,dest,help);
        System.out.println("Move disk "+n+" from "+start+" to "+dest);
        tower(n-1,help,start,dest);
    }
}