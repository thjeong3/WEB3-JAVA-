package 추상클래스_미디어플레이어;

class AudioFile extends MediaFile{
    public AudioFile(String filename) {
            super(filename);
        }
    @Override
    public void play(){
        System.out.printf("오디오 파일을 재생합니다.\n\n");
    }
}

class VideoFile extends MediaFile{
    public VideoFile(String filename) {
        super(filename);
    }
    @Override
    public void play(){
        System.out.printf("비디오 파일을 재생합니다.\n\n");
    }

    public void showSubtitles(){
        System.out.printf("자막:영화 자막을 표시합니다.\n");
    }

}

class ImageFile extends MediaFile{

    public ImageFile(String filename) {
        super(filename);
    }
    @Override
    public void play(){
        System.out.printf("이미지 파일을 표시합니다.\n\n");
    }

}

public class PlayMedia {
    public static void main(String[] args) {
        MediaFile[] play = new MediaFile[3];

        play[0]= new AudioFile("Music.mp3");
        play[1] = new VideoFile("movie.mp4");
        play[2] = new ImageFile("picture.png");

        for(int i=0;i<play.length;i++){
            play[i].getInfo();
            play[i].play();
            
        }
        for(int i=0;i<play.length;i++){
            if(play[i] instanceof VideoFile){
                VideoFile vi = (VideoFile) play[i];
                vi.showSubtitles();
            }
        }
    }
}
