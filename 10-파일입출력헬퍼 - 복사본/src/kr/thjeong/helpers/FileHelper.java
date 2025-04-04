package kr.thjeong.helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class FileHelper {
    private static FileHelper current = null;

    public static FileHelper getInstance(){
        if(current == null){
            current = new FileHelper();
        }
        return current;
    }

    private FileHelper(){
        super();
    }

    public static void freeInstance(){
        current = null;
    }

    public void write(String filePath, byte[] data) throws Exception{
        OutputStream os = null;
        try{
            os = new FileOutputStream(filePath);
            os.write(data);
        }catch(FileNotFoundException e){
            e.printStackTrace();
            throw e;
        }catch(IOException e){
            e.printStackTrace();
            throw e;
        }catch(Exception e){
            e.printStackTrace();
            throw e;
        }finally{
            if(os != null){
                try{ os.close(); }catch(IOException e){ e.printStackTrace();}
            }
        }
    }

    public byte[] read(String filePath) throws Exception{
        byte[] data = null;

        InputStream is = null;
        try{
            is = new FileInputStream(filePath);
            data = new byte[is.available()];
            is.read(data);
        }catch(FileNotFoundException e){
            e.printStackTrace();
            throw e;
        }catch(IOException e){
            e.printStackTrace();
            throw e;
        }catch(Exception e){
            e.printStackTrace();
            throw e;
        }finally{
            if(is != null){
                try{ is.close(); }catch(IOException e){ e.printStackTrace();}
            }
        }

        return data;
    }

    public void writeString(String filePath, String content) throws Exception{
        try{
            this.write(filePath, content.getBytes());
        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
            throw e;
        }catch(Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public String readString(String filePath)throws Exception{
        String content = null;

        try{
            byte[] data = read(filePath);
            content = new String(data,"utf-8");
        }catch(Exception e){
            e.printStackTrace();
            throw e;
        }
        return content;
    }
}
