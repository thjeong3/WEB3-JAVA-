package protoss;
public class Ex01_프로토스_객체 {
    public static void main(String[] args) {
        Protoss p1 = new Protoss("프로브1", 20, 20, 5);
        p1.move("테란본진");
        p1.attack("테란본진");
        System.out.println(p1.toString());
        System.out.println("-------------");

        Zilot p2 = new Zilot("질럿1", 80, 60, 8);
        p2.move("테란본진");
        p2.attack("테란본진");
        p2.swordAttack("테란본진");
        System.out.println(p1.toString());
        System.out.println("-------------");

        Dragun p3 = new Dragun("드라군1", 100, 80, 20);
        p3.move("테란본진");
        p3.attack("테란본진");
        p3.fireAttack("테란본진");
        System.out.println(p3.toString());
        System.out.println("-------------");
    }
}
