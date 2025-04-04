package 추상심화_스마트교통수단제어;

public abstract class Transport {
    private String vehicleId;
    private String status;

    public String getVehicleId() {
        return this.vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Transport(String vehicleId, String status) {
        this.vehicleId = vehicleId;
        this.status = status;
    }
    public void stop(){
        System.out.printf("교통수단 %s가 %s합니다.\n",this.vehicleId,this.status);
    }

    public abstract void start();
    public abstract void navigate(String destination);
}
