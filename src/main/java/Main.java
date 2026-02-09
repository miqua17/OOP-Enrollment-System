public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setStudentID(10209302);
        student.setStudentName("John Doe");
        student.setStudentProgram("BSIT");

        student.display();

        Course course = new Course();
        course.setCourseID(232028302);
        course.setCourseName("Integrative Programming");
        course.setCourseProgram("Information Technology");

        course.display();



    }
}