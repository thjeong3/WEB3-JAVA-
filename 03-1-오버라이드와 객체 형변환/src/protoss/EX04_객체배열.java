package protoss;
public class EX04_객체배열 {
    public static void main(String[] args) {
        Zilot[] z = new Zilot[3];
        z[0]= new Zilot("질럿1",150,100,120);
        z[1]= new Zilot("질럿2",160,170,190);
        z[2]= new Zilot("질럿3",170,130,70);

        for(int i=0;i<z.length;i++){
            z[i].move("테란본진");
            z[i].attack("테란본진");
            z[i].swordAttack("테란본진");

            if(i+1<z.length){
                System.out.println("--------------");
            }
        }
    }
}
