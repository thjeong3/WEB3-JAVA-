public class 배열_연습문제1 {
    public static void main(String[] args) {
        int[] num = new int[100];
        for(int i= 0;i<100;i++){
            num[i]=i+1;
        }
        for(int i=0;i<100;i++){
            if(num[i]%3==0 && num[i]%5==0  ){
                System.out.println(num[i]);
            }
        }
    }
}
