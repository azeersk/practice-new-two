import java.util.*;

public class MainClass {
    public static void main(String[] args){
        Map<String, Integer> empDetails = new HashMap<>();
        for(int i=1; i<=5; i++){
            empDetails.put(("details"+" "+i),i+11805520);
        }

        empDetails.forEach((s,i) ->{
            System.out.println(s + ": "+ i);
        });
//        empDetails = new TreeMap<String, Integer>();


        System.out.println();
        System.out.println();

        List<String> keyList = new ArrayList<>(empDetails.keySet());
        Collections.sort(keyList);
        for(String a : keyList){
            System.out.println(a + ": "+ empDetails.get(a));
        }
    }
}
