import java.util.Scanner;

public class EX01_IF {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("점수 입력하기: ");
        int score = reader.nextInt();
        reader.close();

        System.out.println("점수 체크");
        if(score >= 65){
            System.out.println("65점 이상입니다.");
        }
        System.out.println("시험 통과입니다.");
    }
}
