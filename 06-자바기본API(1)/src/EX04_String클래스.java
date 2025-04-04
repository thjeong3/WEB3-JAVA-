public class EX04_String클래스 {
    public static void main(String[] args) {
        String msg = "Life is too short. You need Java.";
        System.out.println("원본 문자열"+msg);

        int len = msg.length();
        System.out.println("문자열 길이:"+len);

        char str2nd = msg.charAt(2);
        System.out.println("두 번째 글자: "+str2nd);

        int p1 = msg.indexOf("f");
        System.out.println("f가 처음 나타나는 위치 : " +p1);

        System.out.println("z가 처음 나타나는 위치 : "+ msg.indexOf("z"));//문자가 없다면 -1 반환
        System.out.println("'short'가 처음 나타나는 위치: "+msg.indexOf("short"));

        int p2 = msg.indexOf("i");
        int p3 = msg.indexOf("i",p2+1);
        System.out.println("'i'가 첫 번째로 나타내는 위치: "+p2);
        System.out.println("'i'가 두 번째로 나타나는 위치: "+p3);

        int p4 = msg.lastIndexOf("a");
        System.out.println("'a'의 마지막 위치 : "+p4);

        if(msg.indexOf("Hello")>-1){
            System.out.println("Hello가 포함됨");
        }else{
            System.out.println("Hello가 포함되지 않음.");
        }

        String substring1 = msg.substring(0,18);
        System.out.println("문자열 자르기: "+substring1);

        System.out.println("문자열 자르기 -"+msg.substring(19));
        System.out.println("대문자 변환 -"+msg.toUpperCase());
        System.out.println("소문자 변환 -"+msg.toLowerCase());

        String src1 = "  Hello  ";
        String src2 = src1.trim();
        System.out.printf("src1 = [%s]\n",src1);
        System.out.printf("src2 = [%s]\n",src2);

        String txt = "HTML,CSS,Javascript";
        String[] arr = txt.split(",");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        String txt2 = txt.replace(",","$");
        System.out.println(txt2);

        String txt3 = "Hello";
        System.out.println(txt3.equals("hello"));//맞으면 true, 틀리면 false 리턴

        if(txt3.equals("Hello")){
            System.out.println("txt3은 Hello입니다.");
        }else{
            System.out.println("txt3은 Hello가 아닙니다.");
        }
    }
    
}