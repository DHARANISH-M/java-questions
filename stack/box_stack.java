import java.util.Scanner;

class CustomStack {
    private int[] stack = new int[20];
    private int top = -1;
    public void push(int n){
    if(top==stack.length-1){
        System.out.println("Stack overflow!");
        return;
    }
    stack[++top]=n;
}

public void printStack(){
    
    for(int i=top; i>=0;i--){
        System.out.print(stack[i]+" ");
    }
}
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomStack myStack = new CustomStack();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            myStack.push(element);
        }

        myStack.printStack();
    }
}