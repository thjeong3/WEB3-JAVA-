import java.util.Scanner;

public class EX05_IFELSE {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); 
        System.out.print("점수를 입력하세요.:");
        int score = reader.nextInt();
        reader.close();

        System.out.println("시험 시작");

        if(score <= 60){
            System.out.println("합격입니다.");
        }else{
            System.out.println("불합격입니다.");
        }

        boolean isKorean = true;
        //boolean isKorean = false;

        if(isKorean){
            System.out.println("한국 사람입니다.");
        }else{
            System.out.println("한국사람이 아닙니다.");
        }
        if(!isKorean){
            System.out.println("한국 사람이 아닙니다.");
        }else{
            System.out.println("한국 사람입니다.");
        }
       }
}
