import java.util.HashMap;
import java.util.Map;

public class EX01_Map {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();

        map.put("나이",21);
        map.put("키",175);
        map.put("몸무게",80);

        System.out.printf("AGE: %d\n",map.get("나이"));
        System.out.printf("AGE: %d\n",map.get("키"));
        System.out.printf("AGE: %d\n",map.get("몸무게"));
    }
}