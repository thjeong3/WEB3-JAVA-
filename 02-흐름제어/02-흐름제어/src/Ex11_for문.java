public class Ex11_for문 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0;i<110;i += 10){
            sum += i;//sum=sum+i

            System.out.printf("i=%d, sum=%d\n",i,sum);
        }
    }
}
