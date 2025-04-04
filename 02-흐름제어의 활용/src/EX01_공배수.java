import java.util.Scanner;

public class EX01_공배수 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("x입력하세요.");
        int x=reader.nextInt();

        System.out.print("y입력하세요.");
        int y=reader.nextInt();

        reader.close();

        int sum=0;
        for (int i =1; i<=100;i++){
            if(i%x==0&&i%y==0){
                System.out.printf("%3d는 공배수입니다.\n",i);
                sum+=i;
            }
        }
    }
}
