public class EX04_SingleTonPattern {
    public static void main(String[] args) {
        int x = 100;
        int y = 50;

        Calc c1 = new Calc();
        System.out.printf("%d + %d = %d\n", x,y, c1.plus(x, y));

        Calc c2 = new Calc();
        System.out.printf("%d - %d = %d\n", x, y, c2.minus(x, y));

        Calc c3 = new Calc();
        System.out.printf("%d * %d = %d\n", x, y, c3.times(x, y));

        Calc c4 = new Calc();
        System.out.printf("%d / %d = %d\n", x, y, c4.divied(x, y));
        //메모리 소비가 큰 비효율적인 방식->객체를 4번이나 생성하기 때문

        Calc c5 = new Calc();
        System.out.printf("%d + %d = %d\n", x, y, c5.plus(x, y));
        System.out.printf("%d - %d = %d\n", x, y, c5.minus(x, y));
        System.out.printf("%d * %d = %d\n", x, y, c5.times(x, y));
        System.out.printf("%d / %d = %d\n", x, y, c5.divied(x, y));
        //객체 하나로 모든 연산 처리하기.

        CalcSingleTon cs1 = CalcSingleTon.getInstance();
        System.out.printf("%d + %d = %d\n",x,y,cs1.plus(x, y));
        
        CalcSingleTon cs2 = CalcSingleTon.getInstance();
        System.out.printf("%d - %d = %d\n",x,y,cs2.minus(x, y));

        CalcSingleTon cs3 = CalcSingleTon.getInstance();
        System.out.printf("%d * %d = %d\n",x,y,cs3.times(x, y));
        
        CalcSingleTon cs4 = CalcSingleTon.getInstance();
        System.out.printf("%d / %d = %d\n",x,y,cs4.divied(x, y));
        /*싱글톤 객체 활용하기->new 키워드 사용은 할 수 없음(생성자가 은닉되었기 때문) */
    }
}
