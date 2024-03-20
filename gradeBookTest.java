package Package1;

public class gradeBookTest {
    public static void main(String[] args) {
        gradeBook planilla= new gradeBook();

        planilla.setCourseName(" Matematicas");

        String message = planilla.displayMesage();
        System.out.println(message);
    }


}
