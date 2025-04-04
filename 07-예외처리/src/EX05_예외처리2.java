import java.util.Scanner;
public class EX05_예외처리2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("x를 입력하세요: ");
        int x = reader.nextInt();

        System.out.print("y를 입력하세요. ");
        int y = reader.nextInt();

        reader.close();
        Calc c=Calc.getInstance();

        int z = c.divied(x, y);

        System.out.printf("%d/%d=%d\n",x,y,z);
        System.out.println("-------------");

        int a = 0;

        try {
            a= c.diviedEx(x, y);//throws가 적용되었으므로 반드시 try~catch로 불러와야 함
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("%d/%d=%d\n",x,y,z);
    }
}
