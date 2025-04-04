public class CalcSingleTon {
    private static CalcSingleTon current;

    public static CalcSingleTon getInstance(){//외워야 되는 싱글톤 패턴
        if(current == null){
            current = new CalcSingleTon();
        }
        return current;
    }
    /*코드 설명 :
     * private static CalcSingleTon current;로 CalcSingleTon 형의 current 변수를 생성한다. 하지만 current는 값이 없는(null) 상태다.
     * 그래서 if문을 통해 변수 current에 간접적으로 객체를 할당해준다.
    */

    private CalcSingleTon(){
        System.out.println("CalcSingleTon에 대한 current 객체 생성");
    }

    public int plus(int x, int y){return x+y;}
    public int minus(int x,int y){return x-y;}
    public int times(int x,int y){return x*y;}
    public int divied(int x,int y){return x/y;}
}
