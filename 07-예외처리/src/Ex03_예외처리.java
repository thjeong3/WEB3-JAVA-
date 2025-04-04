public class Ex03_예외처리 {
    public static void main(String[] args) {
        int[] k= {10,20,30};

        try{for(int i=0;i<5;i++){//문법적 오류가 발생할 것으로 예상되는 지역에 try문 작성
            System.out.println(k[i]);
            }
        }catch(Exception e){//try~catch문은 세트로 묶여다니는 것
            System.out.println("에러가 발생했습니다.");
            System.out.println("에러의 원인은 "+ e.getMessage());
            System.out.println("----------------");
            e.printStackTrace();
            System.out.println("----------------");
        }finally{//쓰지않아도 됨.
            System.out.println("fin");
        }
    }
}
