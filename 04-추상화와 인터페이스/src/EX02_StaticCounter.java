class StaticCounter{
    static int count = 0;

    public StaticCounter(){
        count++;
    }

    public int getCount(){
        return count*count;
    }
}

public class EX02_StaticCounter {
    public static void main(String[] args) {
        StaticCounter c1 = new StaticCounter();
        System.out.printf("c1의 count:%d\n", c1.getCount());
        StaticCounter c2 = new StaticCounter();
        System.out.printf("c2의 count:%d\n", c2.getCount());
    }
}
