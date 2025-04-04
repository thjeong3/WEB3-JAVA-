package protoss;
public class Zilot extends Protoss{
    public Zilot(String name,int hp, int speed, int dps){
        super(name,hp,speed,dps);
    }

    @Override
    public void move(String target){
        System.out.printf("[Zilot] %s(이)가 %s까지 빠른 속도로 이동합니다.\n",this.getName(),target);
    }

    @Override
    public void attack(String target){
        System.out.printf("[Zilot] %s(이)가 %s(을)를 칼로 찌릅니다. >> 대미지 %d\n",this.getName(),target,this.getDps());
    }

    public void swordAttack(String target){
        System.out.printf("질럿의 고유 공격:%s가 %s를 칼로 찌릅니다.\n",this.getName(),target);
    }
}
