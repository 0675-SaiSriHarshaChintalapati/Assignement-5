import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        String s="Harsha";
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),0);
            }
        }
        for(Map.Entry<Character,Integer> e: map.entrySet()){
            System.out.println(e.getValue()+"-->"+e.getKey());
        }
    }
}