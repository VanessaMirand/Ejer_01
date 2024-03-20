package Package1;

public class gradeBook {

    public String displayMesage(){
        return "Bienvenido al curso" + getCourseName();
    }
    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
