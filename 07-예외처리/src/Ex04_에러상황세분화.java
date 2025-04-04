public class Ex04_에러상황세분화 {
    public static void main(String[] args) {
        int[] data={100,200,300};

        try{
            for(int i =2;i>=-1;i--){
                int k = i != 0 ? data[i] / i:i;
                //int k = data[i]/i;
                System.out.println(k);
            }
        }catch(ArrayIndexOutOfBoundsException e1){//다양한 에러를 출력중
            System.out.println("배열 인덱스 초과");
        }catch(ArithmeticException e2){
            System.out.println("잘못된 연산");
        }catch(Exception e){//모든 예외 선언 클래스의 최상위 클래스.
            System.out.println("알 수 없는 에러 발생");
        }
    }
}
