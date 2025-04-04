package 추상클래스_학교수업관리;

public abstract class Course {
    private String courseName;
    private String teacherName;

    public Course(String courseName, String teacherName) {
        this.courseName = courseName;
        this.teacherName = teacherName;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return this.teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public void showInfo(){
        System.out.printf("수업명: %s, 교사명: %s\n",getCourseName(),getTeacherName());
    }
    public abstract void startClass();

}
