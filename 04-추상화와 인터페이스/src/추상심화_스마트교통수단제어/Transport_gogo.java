package 추상심화_스마트교통수단제어;

class Bus extends Transport{
    public Bus(String vehicleId, String status) {
        super(vehicleId, status);
    }
    @Override
    public void start(){
        System.out.printf("버스 %s가 출발한다.\n",getVehicleId());
    }
    @Override
    public void navigate(String destination){
        System.out.printf("버스가 %s로 이동한다.\n",destination);
    }
}
class Train extends Transport{
    public Train(String vehicleId, String status) {
        super(vehicleId, status);
    }
    @Override
    public void start(){
        System.out.printf("기차 %s가 플랫폼을 떠난다.\n",getVehicleId());
    }
    @Override
    public void navigate(String destination){
        System.out.printf("기차가 %s로 이동한다.\n",destination);
    }
    public void announceStations(){
        System.out.printf("기차가 다음 역을 안내합니다....\n");
    }
}
class Drone extends Transport{
    public Drone(String vehicleId, String status) {
        super(vehicleId, status);
    }
    @Override
    public void start(){
        System.out.printf("드론 %s가 이륙한다.\n",getVehicleId());
    }
    @Override
    public void navigate(String destination){
        System.out.printf("드론이 항공 경로를 따라 %s로 이동한다.\n",destination);
    }
    public void captureSurroundings(){
        System.out.printf("드론이 주변 상황을 촬영한다.\n");
    }
}

public class Transport_gogo {
    public static void main(String[] args) {
        Transport[] trans = new Transport[3];

        trans[0] = new Bus("BUS-001", "이동");
        trans[1] = new Train("TR-202", "대기");
        trans[2] = new Drone("DRN-A7", "정지");

        for(int i=0;i<trans.length;i++){
            trans[i].start();
            trans[i].navigate("서울역");
            trans[i].stop();
            if(trans[i] instanceof Train){
                Train tr = (Train) trans[i];
                tr.announceStations();
            }
            //((Train) trans[1]).announceStations();
            //((Drone) trans[2]).captureSurroundings();
            if(trans[i] instanceof Drone){
                Drone tr = (Drone) trans[i];
                tr.captureSurroundings();
            }
            System.out.println(); 
        }
        
    }
}
