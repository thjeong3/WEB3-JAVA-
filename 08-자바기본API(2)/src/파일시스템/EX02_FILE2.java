package 파일시스템;
import java.io.File;

public class EX02_FILE2 {
    public static void main(String[] args) {
        File f2 = new File("C:/Users/3WEB/workspace-java/08-자바기본API(2)/src/파일시스템/test.txt");
        System.out.println("isFile: "+f2.isFile());
        System.out.println("isDirectory: "+f2.isDirectory());
        System.out.println("isHidden: "+f2.isHidden());
        System.out.println("절대경로 : "+f2.getAbsolutePath());
        System.out.println("존재여부 : "+f2.exists());
        
        f2.mkdirs();
        System.out.println(f2.getName());
        System.out.println(f2.getParent());
    }
}
