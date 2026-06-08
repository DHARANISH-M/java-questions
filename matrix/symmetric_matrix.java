import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n1 = obj.nextInt();
        int n2 = obj.nextInt();

        int[][] arr = new int[n1][n2];

        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < n2; j++) {
                arr[i][j] = obj.nextInt();
            }
        }

        if(n1 != n2) {
            System.out.print("The matrix is not symmetric.");
            return;
        }

        boolean ans = true;

        for(int i = 0; i < n1; i++) {
            for(int j = i + 1; j < n2; j++) {
                if(arr[i][j] != arr[j][i]) {
                    ans = false;
                    break;
                }
            }
        }

        if(ans) {
            System.out.print("The matrix is symmetric.");
        } else {
            System.out.print("The matrix is not symmetric.");
        }
    }
}