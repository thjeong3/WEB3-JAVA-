package 추상심화_자율로봇임무시스템;

public class Dronebot extends Robot implements Flyable,Searchable {

    public Dronebot(String name, int battaryLevel) {
        super(name, battaryLevel);
    }

    @Override
    public void search() {
        System.out.printf("드론이 수색 작업을 시작합니다.\n");
    }

    @Override
    public void fly() {
        System.out.printf("드론이 비행합니다.\n");
    }

    @Override
    public void operate() {
        System.out.printf("드론봇이 공중에서 임무를 시작합니다.\n");
    }
    
}
