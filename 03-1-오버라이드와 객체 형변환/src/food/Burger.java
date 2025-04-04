package food;
public class Burger extends MenuItem{
    Burger(String name, int price){
        super(name,price);
    }
    @Override
    public String toString(){
        return this.getName()+ ": 패티와 빵이 조화를 이루는 메뉴\n";
    }
    @Override
    public String addOption(){
        return "치즈 추가\n";
    }
}
