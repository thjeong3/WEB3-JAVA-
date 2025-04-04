public class EX05_VultureSimulator {
    public static void main(String[] args) {
        Vulture v1 = new Vulture("벌처1", 80);
        Vulture v2 = new Vulture("벌처2", 80);

        v1.state();
        v2.state();

        v1.attacked(90);
        v2.attacked(20);

        v1.state();
        v2.state();

        v1.enhanceHp();
        v2.enhanceHp();

        v1.state();
        v2.state();
    }
}
