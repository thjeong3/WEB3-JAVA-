import java.util.Scanner;

public class EX10_while문 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("숫자 입력하기: ");
        int x = reader.nextInt();
        reader.close();

        int y = 1;

        while(y<10){
            System.out.printf("%d x %d = %d\n",x,y,x*y);
            y++;
        }
    }
}
