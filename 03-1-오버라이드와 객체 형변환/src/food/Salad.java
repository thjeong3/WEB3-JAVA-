package food;
public class Salad extends MenuItem{
    Salad(String name,int price){
        super(name,price);
    }
    @Override
    public String toString(){
        return this.getName()+ ": 신선한 채소로 만든 건강식\n";
    }
    @Override
    public String addOption(){
        return "드레싱 선택: 발사믹\n";
    }
}
