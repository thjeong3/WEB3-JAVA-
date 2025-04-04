import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class Ex02_파일읽기 {
    public static void main(String[] args) {
        String filePath = "test.csv";//csv 파일->엑셀에서 기본 제공.

        byte[] buffer = null;
        String content = null;
        InputStream is = null;
        //->위 세 변수와 객체들은 try문 이전에 전역 변수로 미리 선언해야 이후 finally 블록에서 자원 정리 가능. try 문 안이라면 지역변수가 되어버림.
        try{
            is = new FileInputStream(filePath);
            buffer = new byte[is.available()];
            is.read(buffer);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(is != null){
                try{
                    is.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        if (buffer != null){
            try{
                content = new String(buffer, "utf-8");
                System.out.println(content);
            }catch(UnsupportedEncodingException e){
                System.out.println("[ERROR] 인코딩 지정 에러");
                e.printStackTrace();
            }
        }
    }
}
