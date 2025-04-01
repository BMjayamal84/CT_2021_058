package Q_05;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String stName,dName,cFollowing,lName,cName,cCode;
        Student student = new Student();
        Lecturer lecturer = new Lecturer();
        Course course = new Course();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        stName = scanner.nextLine();
        System.out.println("Enter degree Name: ");
        dName = scanner.nextLine();
        System.out.println("Enter Course Name: ");
        cFollowing = scanner.nextLine();
        cName = cFollowing;
        System.out.println("Enter Lecturer Name: ");
        lName = scanner.nextLine();
        System.out.println("Enter Course code: ");
        cCode = scanner.nextLine();

        student.setStudentName(stName);
        student.setDegreeName(dName);
        student.setCourseFollowing(cFollowing);
        course.setCourseCode(cCode);
        course.setCourseName(cName);
        lecturer.setLecturerName(lName);

        System.out.println("Student name: " + student.getStudentName());
        System.out.println("Lecturer name: " + lecturer.getLecturerName());
        System.out.println("Course name: "+ course.getCourseName());

    }
}
