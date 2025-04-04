public class EX01_예외의이해 {
    public static void main(String[] args) {
        int[] k= {10,20,30};

        for(int i=0;i<5;i++){
            System.out.println(k[i]);//인덱스 3인 데이터가 없으니 에러 발생 후 다운
        }

        System.out.println("fin.");//다운됬으므로 실행되지 않는 구문.
    }
    
}