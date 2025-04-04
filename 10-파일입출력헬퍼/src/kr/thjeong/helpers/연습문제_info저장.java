package kr.thjeong.helpers;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class 연습문제_info저장 {
    public static void main(String[] args) {
        String filePath = "./info.txt";

        Scanner input = new Scanner(System.in);
        System.out.println("이름/연락처/나이/키 입력: ");
        String name = input.nextLine();
        String phoneNo = input.nextLine();
        int age = input.nextInt();
        int height = input.nextInt();
        
        input.close();

        //String info = String.format("입력된 사용자 정보:\n이름: %s\n연락처: %s\n나이: %d\n키: %d", name,phoneNo,age,height);
        String info = ("이름 : "+ name + "\n전화번호 : "+ phoneNo + "\n나이 : " + String.valueOf(age) + "\n키 : " + String.valueOf(height));

        byte[] data = null;
        try{
            data = info.getBytes("utf-8");
        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }

        try{
            FileHelper.getInstance().write(filePath, data);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            byte[] read = FileHelper.getInstance().read(filePath);
            System.out.println(new String(read, "utf-8"));
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
