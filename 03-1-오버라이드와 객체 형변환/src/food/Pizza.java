package food;
public class Pizza extends MenuItem{
    Pizza(String name, int price){
        super(name,price);
    }
    @Override
    public String toString(){
        return this.getName() + " : 치즈 듬뿍, 모두의 인기 메뉴\n";
    }
    @Override
    public String addOption(){
        return "엣지 변경: 치즈 크러스트\n";
    }
}
