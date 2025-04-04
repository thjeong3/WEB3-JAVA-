import java.util.Scanner;

public class Ex02_IF비교 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("나이 입력하기: ");
        int myage = reader.nextInt();
        reader.close();

        if(myage == 19){
            System.out.printf("당신의 나이는 %d살 입니다.\n",myage);
        }

        if(myage != 19){
            System.out.printf("당신의 나이는 %d살이 아닙니다.\n",myage);
        }

        if(myage > 19){
            System.out.println("당신은 성인입니다.");
        }
        if(myage <=19){
            System.out.println("당신은 미성년자입니다.");
        }
    }
}
