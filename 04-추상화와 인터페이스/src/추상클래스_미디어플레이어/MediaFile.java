package 추상클래스_미디어플레이어;

public abstract class MediaFile {
    private String filename;

    public MediaFile(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void getInfo(){
        System.out.printf("파일명: %s\n",filename);
    }

    public abstract void play();
}
