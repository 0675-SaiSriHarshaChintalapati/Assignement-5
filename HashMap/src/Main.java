import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"har");
        map.put(2,"sha");
        map.put(3,"chin");
        System.out.println(map.getOrDefault(4,"Not found"));
        for(Map.Entry<Integer,String> e: map.entrySet()){
            System.out.println(e.getValue());
            System.out.println(e.getKey());
        }
    }
}