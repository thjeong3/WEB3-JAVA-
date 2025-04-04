

public class 몬스터 extends Unit implements IMove, IFight{

    public 몬스터(String name, int hp, int speed, int dps) {
        super(name, hp, speed, dps);
    }

    @Override
    public void jump() {
        System.out.printf("[%s]-점프한다.\n",this.getName());
    }

    @Override
    public void run() {
        System.out.printf("[%s]-달려간다.\n",this.getName());
    }

    @Override
    public void walk() {
        System.out.printf("[%s]-걷는다.\n",this.getName());
    }

    @Override
    public void attack() {
        System.out.printf("[%s]-%d의 힘으로 주인공을 공격한다.\n",this.getName(),this.getDps());
    }

    @Override
    public void defense() {
        System.out.printf("[%s]-상대의 공격을 방어한다.\n",this.getName()); 
    }

    @Override
    public void evasion() {
        System.out.printf("[%s]-상대의 공격을 회피한다.\n",this.getName());
    }
    
}
