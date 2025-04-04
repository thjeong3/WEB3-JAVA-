public class EX04_IF문논리값조건 {
    public static void main(String[] args) {
        boolean isKorean = true;
        //boolean isKorean = false;

        if(isKorean == true){
            System.out.println("한국 사람입니다.");
        }

        if(isKorean == false){
            System.out.println("한국사람이 아닙니다.");
        }
        if(isKorean != true){
            System.out.println("한국 사람입니다.");
        }
        if(isKorean != true){
            System.out.println("한국사람이 아닙니다.");
        }
        if(isKorean){
            System.out.println("한국 사람입니다.");
        }
        if(!isKorean){
            System.out.println("한국사람이 아닙니다.");
        }
    }
}
