import java.util.Scanner;

class CustomStack {
    private final int MAX_SIZE = 20;
    private int[] stack = new int[MAX_SIZE];
    private int top = -1;
    // You are using Java
public void push(int n){
    stack[++top]=n;
}
public int pop(){
    return stack[top--];
}
public int findMinimum(){
    int min=stack[0];
    for(int i=1;i<=top;i++){
        min=Math.min(min,stack[i]);
    }
    return min;
   
}
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomStack stack = new CustomStack();

        int n = scanner.nextInt();  

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            stack.push(value);
        }

        System.out.println("Minimum element in the stack: " + stack.findMinimum());

        int popped = stack.pop();
        if (popped != Integer.MIN_VALUE) {
            System.out.println("Popped element: " + popped);
        }

        System.out.println("Minimum element in the stack after popping: " + stack.findMinimum());

        scanner.close();
    }
}