// You are using Java
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        int num=obj.nextInt();
        for(int i=0;i<num;i++){
            String word=obj.next();
            
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList());
            }
            map.get(key).add(word);
        }
        for(ArrayList<String> group: map.values()){
            System.out.println(String.join(" ",group));
        }
        
    }
}
