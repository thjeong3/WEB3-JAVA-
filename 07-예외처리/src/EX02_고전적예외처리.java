public class EX02_고전적예외처리 {
    public static void main(String[] args) {
        int[] k= {10,20,30};

        for(int i=0;i<5;i++){
            if(i<3){//if문으로 예외처리-인덱스 3 이상이면 출력하지 않음
                System.out.println(k[i]);
            }
        }
        System.out.println("fin");
    }
}
