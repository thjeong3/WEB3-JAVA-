package 추상심화_자율로봇임무시스템;

public class RescueBot extends Robot implements Rescuable{

    public RescueBot(String name, int battaryLevel) {
            super(name, battaryLevel);
        }
    
        @Override
    public void rescue() {
        System.out.printf("구조 임무를 수행합니다.\n");
    }

    @Override
    public void operate() {
        System.out.printf("구조봇이 현장에 투입됩니다.\n");
    }
    
}
