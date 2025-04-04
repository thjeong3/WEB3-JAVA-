package SmartHome;

class SmartLight extends SmartDevice{
    SmartLight(String name){
        super(name);
    }
    public void changeColor(String color){
        if(getIsOn()==false){
            System.out.printf("전원이 꺼져 있어 전등 색을 바꿀 수 없습니다.\n");
        }else if(getIsOn()==true){
        System.out.printf(getName()+ "의 전등 조명이 "+color+"색으로 바뀝니다.\n");}
    }
}
class SmartSpeaker extends SmartDevice{
    SmartSpeaker(String name){
        super(name);
    }
    public void playMusic(String song){
        if(getIsOn()==false){
            System.out.printf("전원이 꺼져 있어 음악을 켤 수 없습니다.\n");
        }else if(getIsOn()==true){
        System.out.printf(getName()+ "음악을 "+song+"(으)로 바꿉니다.\n");}
    }
}
class SmartThermostat extends SmartDevice{
    SmartThermostat(String name){
        super(name);
    }
    public void setTemperature(int degree){
        if(getIsOn()==false){
            System.out.printf("전원이 꺼져 있어 온도를 바꿀 수 없습니다.\n");
        }else if(getIsOn()==true){
        System.out.printf(getName()+ "온도를 "+degree+"도로 바꿉니다.\n");}
    }
}

public class SmartHomeTest {
    public static void main(String[] args) {
        SmartDevice[] devices = new SmartDevice[3];
        devices[0] = new SmartLight("스마트 전등");
        devices[1] = new SmartSpeaker("스마트 스피커");
        devices[2] = new SmartThermostat("스마트 온도조절기");

        for (int i = 0; i < devices.length; i++) {
            devices[i].turnOn();
        }
 
        for (int i = 0; i < devices.length; i++) {
            devices[i].showStatus();
        }
        System.out.println();
 
        SmartLight light = (SmartLight) devices[0];
        light.changeColor("파란색");
        SmartSpeaker speaker = (SmartSpeaker) devices[1];
        speaker.playMusic("Jazz");

        SmartThermostat thermostat = (SmartThermostat) devices[2];
        thermostat.setTemperature(24);
    }

}

