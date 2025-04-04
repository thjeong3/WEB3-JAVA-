package productmenu;
public class Call_Product {
    public static void main(String[] args) {
        Product[] pro = new Product[3];

        pro[0] = new Electronics();
        pro[1] = new Clothing();
        pro[2] = new Food();

        for(int i=0;i<pro.length;i++){
            pro[i].showInfo();
            if(pro[i] instanceof Food){
                Food f = (Food) pro[i];
                System.out.println(f.checkExpiration(5));
            }
        }
    }
}
