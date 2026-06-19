import java.util.Scanner;

class Stack {
    private int top;
    private int capacity;
    private char[] array;
    public Stack(int capacity){
    this.capacity=capacity;
    array=new char[capacity];
    top=-1;
}
private void push(char c){
    array[++top]=c;
    
}
private char pop(){
    return array[top--];
}
private char peek(){
    return array[top];
}
private boolean isEmpty(){
    return top==-1;
}
int prec(char c){
    if(c=='^') return 5;
    if(c=='*'|| c=='/') return 3;
    if(c=='-'|| c=='+') return 2;
    return -1;
}
String infixToPostfix(String s){
    char c[]=s.toCharArray();
    StringBuilder result=new StringBuilder();
    for(int i=0;i<c.length;i++){
        char ch=c[i];
        if(Character.isLetterOrDigit(ch)){
            result.append(ch);
        }else if(ch=='('){
            push(ch);
        }else{
            if(ch==')'){
                while(!isEmpty()&&peek()!='('){
                    result.append(pop());
                }
                if(!isEmpty()){
                pop();
                }
            }else{
                while(!isEmpty()&&prec(peek())>=prec(ch)){
                    result.append(pop());
                }
                push(ch);
            }
        }
    }
    
    while(!isEmpty()){
        result.append(pop());
    }
    return result.toString();
}
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.nextLine();

        Stack stack = new Stack(exp.length());

        String postfix = stack.infixToPostfix(exp);
        System.out.println(postfix);

        scanner.close();
    }
}