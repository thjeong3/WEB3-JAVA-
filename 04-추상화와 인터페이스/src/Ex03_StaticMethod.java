class StaticCounter2{
    static int count = 0;
    boolean created = false;

    public StaticCounter2(){
        count++;
        created = true;
    }

    public int getNormal(){
        created = true;
        return count;
    }

    public static int getStatic(){
        return count;
    }

    public boolean getCreated(){
        return created;
    }
}

public class Ex03_StaticMethod {
    public static void main(String[] args) {
        System.out.printf("전체 객체의 수: %d\n\n",StaticCounter2.count);

        StaticCounter2 c1 = new StaticCounter2();
        StaticCounter2 c2 = new StaticCounter2();

        System.out.printf("c1의 getNormal() 리턴값: %d\n",c1.getNormal());
        System.out.printf("c2의 getNormal() 리턴값: %d\n\n",c2.getNormal());
        
        System.out.printf("c1의 getStatic() 리턴값: %d\n",StaticCounter2.getStatic());
        System.out.printf("c2의 getStatic() 리턴값: %d\n\n",StaticCounter2.getStatic());

        System.out.printf("c1의 getCreated() 리턴값: %b\n",c1.getCreated());
        System.out.printf("c2의 getCreated() 리턴값: %b\n\n",c2.getCreated());

        System.out.printf("전체 객체의 수: %d\n",StaticCounter2.count);
    }
}
