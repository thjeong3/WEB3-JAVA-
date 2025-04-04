import java.util.Scanner;

public class EX08_스위치 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("색상을 입력하세요.빨강/노랑/초록/파랑");
        String color = sc.nextLine();
        sc.close();

        switch(color){
            case "빨강":
                System.out.println("빨간색을 골랐습니다.");
                break;
            case "노랑":
                System.out.println("노란색을 골랐습니다.");
                break;
            case "초록":
                System.out.println("초록색을 골랐습니다.");
                break;
            case "파랑":
                System.out.println("파란색을 골랐습니다.");
                break;
            default:
                System.out.println("잘못된 색을 골랐습니다.");
                break;
        }

    }
}
