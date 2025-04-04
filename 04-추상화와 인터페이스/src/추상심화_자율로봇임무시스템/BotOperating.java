package 추상심화_자율로봇임무시스템;

public class BotOperating {
    public static void main(String[] args) {
        Robot[] oper = new Robot[3];

        oper[0] = new Dronebot("드론-01",80);
        oper[1] = new RescueBot("구조-09", 65);
        oper[2] = new HybridBot("하이브리드-X", 95);

        for(int i=0;i<oper.length;i++){
            oper[i].showStatus();
            oper[i].operate();
            if(oper[i] instanceof Flyable){
                ((Flyable) oper[i]).fly();
            }

            if(oper[i] instanceof Searchable){
                ((Searchable) oper[i]).search();
            }

            if(oper[i] instanceof Rescuable){
                ((Rescuable) oper[i]).rescue();
            }
            System.err.println();
        }
    }
}
