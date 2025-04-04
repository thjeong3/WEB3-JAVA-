import java.util.ArrayList;
import java.util.List;

public class EX03_List {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<Integer>();

        for(int i=1;i<10;i++){
            numberList.add(i*10);  
        }

        int count = numberList.size();
        System.out.println("데이터 크기: "+count);

        System.out.println("4번 데이터 값: "+numberList.get(4));
        numberList.remove(4);

        count = numberList.size();
        System.out.println("데이터 크기: "+count);
        System.out.println("4번 데이터 값: "+numberList.get(4));

        numberList.add(4,123);
        System.out.println("4번 데이터 값: "+numberList.get(4));
    }
}
