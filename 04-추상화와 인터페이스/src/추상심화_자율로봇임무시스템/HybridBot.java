package 추상심화_자율로봇임무시스템;

public class HybridBot extends Robot implements Flyable, Searchable, Rescuable{

    public HybridBot(String name, int battaryLevel) {
            super(name, battaryLevel);
        }
    
        @Override
    public void rescue() {
        System.out.printf("구조 임무를 수행합니다.\n");
    }

    @Override
    public void search() {
        System.out.printf("드론이 수색 작업을 수행합니다.\n");
    }

    @Override
    public void fly() {
        System.out.printf("드론이 비행합니다.\n");
    }

    @Override
    public void operate() {
        System.out.printf("하이브리드봇이 다기능 모드로 작동합니다.\n");
    }
    
}
