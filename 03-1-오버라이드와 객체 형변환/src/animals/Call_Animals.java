package animals;
class Penguin extends Animal{
    @Override
    public void move(){
        System.out.printf("펭귄이 미끄러지듯 이동합니다.\n");
    }
    @Override
    public void makeSound(){
        System.out.printf("펭귄이 삐약삐약 웁니다.\n");
    }
    public void swim(){
        System.out.printf("펭귄이 수영합니다.\n");
    }
}

class Lion extends Animal{
    @Override
    public void move(){
        System.out.printf("사자가 네 발로 달려갑니다.\n");
    }
    @Override
    public void makeSound(){
        System.out.printf("사자가 포효합니다.\n");
    }
}

class Elephant extends Animal{
    @Override
    public void move(){
        System.out.printf("코끼리가 천천히 걷습니다.\n");
    }
    @Override
    public void makeSound(){
        System.out.printf("코끼리가 코로 웁니다.\n");
    }
    
}

public class Call_Animals {
    public static void main(String[] args) {
        Animal[] ani = new Animal[3];

        ani[0] = new Lion();
        ani[1] = new Elephant();
        ani[2] = new Penguin();

        for(int i=0;i<ani.length;i++){
            ani[i].move();
            ani[i].makeSound();
            if(ani[i] instanceof Penguin){
                Penguin p = (Penguin) ani[i];
                p.swim();
            }
        }
    }
}
