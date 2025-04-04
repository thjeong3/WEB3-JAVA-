class Zealot{
    int hp;
    int dps;

    void state(){
        System.out.printf("상태 확인 >>> hp: %d, dps: %d\n",hp,dps);
    }

    void upgrade(){
        dps += 1;
        System.out.printf("업그레이드를 하여 공격력 1이 증가합니다.");
    }

    void attacked(int enemyAttack){
        hp-=enemyAttack;
        System.out.printf("%d의 피해를 받아 hp가 %d만큼 감소합니다.\n",enemyAttack,hp);
    }
}

public class Ex03_ZealoutSimulator {
    public static void main(String[] args) {
        Zealot zealot1=new Zealot();
        zealot1.hp = 100;
        zealot1.dps = 8;

        zealot1.state();
        zealot1.attacked(30);
        zealot1.state();
        zealot1.upgrade();
        zealot1.state();
    }
}
