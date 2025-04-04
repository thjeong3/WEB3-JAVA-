import java.util.HashMap;
import java.util.Map;

public class EX02_직접정의자료구조 {
    public static void main(String[] args) {
        Map<String,Member> map = new HashMap<String,Member>();

        Member mem1 = new Member("010-1234-2345", "member@1naver.com");
        map.put("철수",mem1);

        map.put("수현",new Member("010-2344-3693","member2@naver.com"));
        map.put("석훈",new Member("010-9533-3513","member3@naver.com"));
        map.put("민영",new Member("010-4930-0044","member4@naver.com"));
        map.put("호영",new Member("010-8394-9873","member5@naver.com"));

        Member output = map.get("호영");
        System.out.println(output.toString());
    }
}
