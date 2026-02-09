public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setStudentID(10209302);
        student.setStudentName("John Doe");
        student.setStudentProgram("BSIT");



        Course course = new Course();
        course.setCourseID(232028302);
        course.setCourseName("Integrative Programming");
        course.setCourseProgram("Information Technology");

        System.out.println("Student ID:" + student.getStudentID());
        System.out.println("Student Name:" + student.getStudentName());
        System.out.println("Student Program:" + student.getStudentProgram());


        System.out.println("Course ID:" + course.getCourseID());
        System.out.println("Course Name:" + course.getCourseName());
        System.out.println("Course Program:" + course.getCourseProgram());

    }
}