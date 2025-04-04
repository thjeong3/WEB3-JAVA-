public class 번외_문자열숫자변환 {
    public static void main(String[] args) {
        String mynum = "123";
        int realNum = Integer.parseInt(mynum);
        System.out.println(realNum+1000);

        int mynum2 = 123;
        String strNum = String.valueOf(mynum2);
        System.out.println(strNum+1000);
    }
}
