class Dragoon{
    //방어타입-대형(big), 공격타입-폭발형(소형에 0.5배, 중형에 0.75배, 대형에 1배)
    int speed;
    int hp;
    int shield; //private 선언을 안하면 이후 클래스에서 임의로 값을 수정해버림
    int attack;
    int defence;
    String defence_type = "big";
    String attack_type = "explosive";

    Dragoon(int speed, int hp, int shield, int attack, int defence){
        this.speed = speed;
        this.hp = hp;
        this.shield = shield;
        this.attack = attack;
        this.defence = defence;
    }
    int attack_upgrade(){
        System.out.println("upgrade complete");
        attack += 1;
        return attack;
    }
    int defence_updrage(){
        System.out.println("upgrade complete");
        defence += 1;
        return defence;
    }
    int damaged(int enemy_damage){
        if (shield > 0) {
            if (shield >= enemy_damage) {
                shield -= enemy_damage;
            } else {
                int remain_damage = enemy_damage - shield - defence;
                shield = 0;
                hp -= remain_damage;
            }
        } else {
            hp -= enemy_damage;
        }
        return hp;
    }
}

class test_enemy{
    private int attack;

    test_enemy(int attack){
        this.attack = attack;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

}

public class Ex01_DragoonSimulator {
    public static void main(String[] args) {
        Dragoon dg1 = new Dragoon(10,100,80,20,1);
        test_enemy test1 = new test_enemy(100);

        System.out.printf("해당 드라군의 능력치-속도 %d, 체력 %d, 실드 %d, 공격력 %d, 방어력 %d\n",dg1.speed,dg1.hp,dg1.shield,dg1.attack,dg1.defence);
        dg1.attack_upgrade();
        dg1.defence_updrage();
        System.out.printf("해당 드라군의 능력치-속도 %d, 체력 %d, 실드 %d, 공격력 %d, 방어력 %d\n",dg1.speed,dg1.hp,dg1.shield,dg1.attack,dg1.defence);
        
        dg1.damaged(test1.getAttack());
        System.out.printf("해당 드라군의 능력치-속도 %d, 체력 %d, 실드 %d, 공격력 %d, 방어력 %d\n",dg1.speed,dg1.hp,dg1.shield,dg1.attack,dg1.defence);
    }
    
}
