import java.util.Scanner;

class Reservoir {
    // You are using Java
public static long maxArea(long[] h,int n,long m){
    int left=0;
    int right=n-1;
    long marea=0;
    while(left<right){
        long w=right-left;
        long height=Math.min(Math.min(h[left],h[right]),m);
        long area=w*height;
        marea=Math.max(marea,area);
        if(h[left]<h[right]){
            left++;
        }else{
            right--;
        }
    }
    return marea;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long m = sc.nextLong();

        long[] h = new long[n];

        for (int i = 0; i < n; i++)
            h[i] = sc.nextLong();

        System.out.println(maxArea(h, n, m));

        sc.close();
    }
}