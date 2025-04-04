import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class EX01_파일저장 {
    public static void main(String[] args) {
        String filePath = "./test.csv";
        String content = "번호, 이름, 나이\n1, 김철수, 16\n2,박민수,18\n3,이호영,17";

        byte[] buffer = null;
        try {
            buffer = content.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        OutputStream os = null;
        try {
            os = new FileOutputStream(filePath);
            os.write(buffer);
            //OutputStream os = new FileOutputStream(filePath);
            /*try {
                os.write(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
                ->try~catch문을 중첩해서 쓰면 프로그램에 부하가 올 수 있음. java에서 try catch문은 리소스 부담이 많이 가는 코드인데, 하나하나 오류가 있는지 없는지 검사해야 하기 때문.*/
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){//오류검출 최상위 클래스로 사용 필수
            e.printStackTrace();
        } finally {
            if(os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            /*try {
                os.close();->os 객체가 비어있는 상태면 애초에 close할 객체가 없어서 오류 발생. 따라서 if문으로 객체가 비어있지 않을 때만 close하도록 변경하기.
            } catch (IOException e) {
                e.printStackTrace();
            }*/
        }
    }
}
