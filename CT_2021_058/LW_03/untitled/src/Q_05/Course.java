package Q_05;

public class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getLecturerName() {
        return lecturer.getLecturerName();
    }

    public void setLecturer(String name) {
        lecturer.setLecturerName(name);
        lecturer.setCourseTeaching(courseName);
    }
}
