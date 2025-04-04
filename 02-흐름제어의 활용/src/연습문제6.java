public class 연습문제6 {
    public static void main(String[] args) {
        int[] price = {38000,20000,17900,17900};
        int[] qty = {6,4,3,5};
        int[] partprice = new int[price.length];
        int max = partprice[0];
        int total = 0,free=0;
        for(int i=0;i<price.length;i++){
            total += price[i]*qty[i];
            partprice[i]=price[i]*qty[i];
        }
        for(int j=0;j<partprice.length;j++){
            if(max<partprice[j]){
                max=partprice[j];
            }
            if(partprice[j]>=80000){
                free++;
            }
        }

        System.out.println("전체 결제 금액: "+total+"원");
        System.out.println("가장 높은 상품금액: "+max+"원");
        System.out.println("무료배송 항목: "+free+"건");
    }
}
