public class Vulture {
    private String name;
    private int hp;

    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name=name;
    }

    int getHp(){
        return this.hp;
    }
    void setHp(int hp){
        if(hp<1){
            hp=0;
            System.out.println("유닛 사망!\n");
        }
        this.hp = hp;
    }
    public Vulture(String name,int hp){
        this.setName(name);
        this.setHp(hp);
        System.out.printf("%s가 생성되었다.\n",this.name);
    }
    void state(){
        System.out.printf("%s hp: %d\n",this.getName(),this.getHp());
    }
    void enhanceHp(){
        this.setHp(getHp()+10);
        System.out.printf("upgrade complete\n");
    }
    void attacked(int enemyAttack){
        this.setHp(this.getHp()-enemyAttack);
        System.out.printf("%s가 적의 공격으로 인해 hp가 %d 감소했다.\n",this.getName(),enemyAttack);
    }

}
