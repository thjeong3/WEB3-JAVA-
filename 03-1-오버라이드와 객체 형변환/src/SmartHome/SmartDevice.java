package SmartHome;

public class SmartDevice {
    private String name;
    private boolean isOn;

    public SmartDevice(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsOn() {
        return this.isOn;
    }

    public boolean getIsOn() {
        return this.isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void turnOn(){
        isOn = true;
        System.out.printf(name+ "의 전원이 켜졌습니다.\n");
    }
    public void turnOff(){
        isOn = false;
        System.out.printf(name+ "의 전원이 꺼졌습니다.\n");
    }
    public void showStatus(){
        if(isOn == true){
            System.out.printf(name + "상태: ON\n");
        }else if(isOn==false){
            System.out.printf(name + "상태: OFF\n");
        }
    }
}

