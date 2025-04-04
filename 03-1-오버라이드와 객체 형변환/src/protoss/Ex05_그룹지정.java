package protoss;
public class Ex05_그룹지정 {
    public static void main(String[] args) {
        Protoss[] p = new Protoss[5];

        p[0] = new Zilot("질럿1", 130, 90, 100);
        p[1] = new Dragun("드라군1", 100, 80, 20);
        p[2] = new Dragun("드라군2", 100, 100, 100);
        p[3] = new Zilot("질럿2", 180, 60, 8);
        p[4] = new Dragun("드라군3", 323, 98, 102);
        System.out.println("--------");

        for(int i = 0;i<p.length;i++){
            p[i].move("저그본진");
            p[i].attack("저그본진");

            if(p[i] instanceof Zilot){
                Zilot z = (Zilot) p[i];
                z.swordAttack("저그본진");
            }else if(p[i] instanceof Dragun){
                Dragun d = (Dragun) p[i];
                d.fireAttack("저그본진");
            }
        }
    }
}
