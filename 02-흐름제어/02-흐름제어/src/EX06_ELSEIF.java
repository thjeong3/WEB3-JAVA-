import java.util.Scanner;

public class EX06_ELSEIF {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("점수 입력하기: ");
        int point = reader.nextInt();
        reader.close();

        if(point > 90){
            System.out.println("A");
        }else if(point>80){
            System.out.println("B");
        }else if(point<70){
            System.out.println("C");
        }else{
            System.out.println("F");
        }
    }
}
