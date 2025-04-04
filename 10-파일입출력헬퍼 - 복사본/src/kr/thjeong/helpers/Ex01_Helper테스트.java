package kr.thjeong.helpers;

import java.io.UnsupportedEncodingException;


public class Ex01_Helper테스트 {
    public static void main(String[] args) {
        String filePath = "./helper테스트.txt";
        String content = "이것은 테스트 입니다.";//파일 생성하는 과정

        byte[] data = null;
        try{
            data = content.getBytes("utf-8");
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
