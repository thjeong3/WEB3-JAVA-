package 추상심화_자율로봇임무시스템;

public abstract class Robot {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBattaryLevel() {
        return this.battaryLevel;
    }

    public void setBattaryLevel(int battaryLevel) {
        this.battaryLevel = battaryLevel;
    }
    private int battaryLevel;

    public Robot(String name, int battaryLevel) {
        this.name = name;
        this.battaryLevel = battaryLevel;
    }
    public void showStatus(){
        System.out.printf("로봇명 : [%s], 배터리: [%d]%%\n",getName(),battaryLevel);
    }
    public abstract void operate();
}
