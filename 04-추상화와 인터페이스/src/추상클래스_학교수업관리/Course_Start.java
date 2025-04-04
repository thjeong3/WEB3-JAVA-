package 추상클래스_학교수업관리;
class OnlineCourse extends Course{
    public OnlineCourse(String courseName, String teacherName) {
        super(courseName, teacherName);
    }
    @Override
    public void startClass(){
        System.out.printf("Zoom 링크를 통해 온라인 수업을 시작합니다.\n");
    }
}
class OfflineCourse extends Course{
    public OfflineCourse(String courseName, String teacherName) {
        super(courseName, teacherName);
    }
    @Override
    public void startClass(){
        System.out.printf("지정된 강의실에서 수업을 시작합니다.\n");
    }
}
class HybridCourse extends Course{
    public HybridCourse(String courseName, String teacherName) {
        super(courseName, teacherName);
    }
    @Override
    public void startClass(){
        System.out.printf("온라인과 오프라인 수업을 병행합니다.\n");
    }
    public void switchMode(String mode){
        System.out.printf("현재 수업 모드를 [%s]로 변경합니다.\n",mode);
    }
}

public class Course_Start {
    public static void main(String[] args) {
        Course[] c = new Course[3];

        c[0] = new OnlineCourse("자바 프로그래밍", "김교수");
        c[1] = new OfflineCourse("자료구조", "이교수");
        c[2] = new HybridCourse("AI프로젝트", "박교수");

        for(int i=0;i<c.length;i++){
            c[i].showInfo();
            c[i].startClass();
        }
        for(int i=0;i<c.length;i++){
            if(c[i] instanceof HybridCourse){
                HybridCourse hybrid = (HybridCourse) c[i];
                hybrid.switchMode("대면");
            }
        }
        
    }
}
