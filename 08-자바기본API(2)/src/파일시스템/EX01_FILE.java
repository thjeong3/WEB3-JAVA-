package 파일시스템;
import java.io.File;

public class EX01_FILE {
    public static void main(String[] args) {
        File f1 = new File("./test.txt");

        boolean is_file = f1.isFile();
        System.out.println("isFile =" + is_file);
        System.out.println("현재 작업 디렉토리: "+ System.getProperty("user.dir"));

        boolean is_dir = f1.isDirectory();
        System.out.println("isDirectory="+is_dir);

        boolean is_hidden = f1.isHidden();
        System.out.println("idHidden="+is_hidden);

        String abs = f1.getAbsolutePath();
        System.out.println("절대경로: "+abs);

        boolean is_exist = f1.exists();
        System.out.println("존재여부: "+is_exist);
    }
}
