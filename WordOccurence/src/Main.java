import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s="Hello world Hello World hi how are you hi";
         s=s.toLowerCase();
        String[] a=s.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else{
                map.put(a[i],1);
            }
        }
        System.out.println(map);
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey()+"-"+e.getValue());
        }
    }
}