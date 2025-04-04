package RPG_1;

public class 주인공 extends Unit implements IFight, IMove, IMovement{

    public 주인공(String name, int hp, int speed, int dps) {
        super(name, hp, speed, dps);
    }

    @Override
    public void attack() {
        System.out.printf("[%s]-%d의 힘으로 몬스터를 공격한다.\n",this.getName(),this.getDps());
    }

    @Override
    public void defense() {
        System.out.printf("[%s]-상대의 공격을 방어한다.\n",this.getName());
    }

    @Override
    public void evasion() {
        System.out.printf("[%s]-상대의 공격을 회피한다.\n",this.getName());
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
    public void pickUpItem() {
        System.out.printf("[%s]-%d의 속도로 걷는다.\n",this.getName(),this.getSpeed());
    }

    @Override
    public void talkNpc() {
        System.out.printf("[%s]-NPC와 대화한다.\n",this.getName());
    }
    
}
