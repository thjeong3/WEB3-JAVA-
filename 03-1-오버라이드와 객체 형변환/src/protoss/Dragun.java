package protoss;
public class Dragun extends Protoss {
    public Dragun(String name,int hp, int speed, int dps){
        super(name,hp,speed,dps);
    }
    @Override
    public void attack(String target){
        super.attack(target);
        System.out.println("원거리 공격 퐌 발사");
    }
    @Override
    public void move(String position){
        super.move(position);
        System.out.println("지정된 위치까지 이동");
    }
    public void fireAttack(String target){
        System.out.printf("드라군의 고유 공격:%s가 %s에게 원거리 공격을 합니다.",this.getName(),target);
    }
}
