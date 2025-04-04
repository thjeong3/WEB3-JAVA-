package food;
public class Call_Menu {
    public static void main(String[] args) {
        MenuItem[] menu = new MenuItem[3];
        int totalprice = 0;

        menu[0] = new Burger("치즈버거", 6000);
        menu[1] = new Pizza("페퍼로니 피자", 12000);
        menu[2] = new Salad("그린 샐러드", 7000);

        for(int i=0;i<menu.length;i++){
            System.out.printf(menu[i].toString());
            totalprice+=menu[i].getPrice();
        }

        System.out.printf("총 가격: %s원 \n옵션 적용:\n",totalprice);
        for(int i=0;i<menu.length;i++){
            if(menu[i] instanceof Burger){
                Burger bur = (Burger) menu[i];
                System.out.printf("\t%s -> %s",bur.getName(),bur.addOption());
            }else if(menu[i] instanceof Pizza){
                Pizza piz = (Pizza) menu[i];
                System.out.printf("\t%s -> %s",piz.getName(),piz.addOption());
            }else if(menu[i] instanceof Salad){
                Salad sal = (Salad) menu[i];
                System.out.printf("\t%s -> %s",sal.getName(),sal.addOption());
            }
        }
        
        
    }
}
