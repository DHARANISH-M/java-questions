// You are using Java
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        char[] ch=s.toCharArray();
        System.out.print(check(ch));
    }
    static boolean check(char[] ch){
        Stack<Character> p=new Stack<>();
        for(char c:ch){
            if(c=='(' || c=='[' || c=='{'){
                p.push(c);
            }else{
                if(p.isEmpty()) return false;
                if(c==')' && p.pop() !='(') return false;
                if(c==']' && p.pop() !='[') return false;
                if(c=='}' && p.pop() !='{') return false;
            }
        }return p.isEmpty();
    }
}