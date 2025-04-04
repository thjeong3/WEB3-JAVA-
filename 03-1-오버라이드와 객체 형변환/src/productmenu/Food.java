package productmenu;
public class Food extends Product{
    @Override
    public void showInfo(){
        System.out.printf("식품입니다. 유통기한을 확인하세요!\n");
    }
    public String checkExpiration(int expiredate){
        return (expiredate <= 0) ? "상한 음식입니다!" : "상하지 않은 음식입니다!";
    }
}
