package se.lexicon.course_manager_assignment.model;
import java.time.LocalDate;

public class Course {


    int Id;
    Course courseName;
    LocalDate startDate;
    int weekDuration;
    Student student;

    public Course(int id, Course courseName, LocalDate startDate, int weekDuration, Student student) {
        Id = id;
        this.courseName = courseName;
        this.startDate = startDate;
        this.weekDuration = weekDuration;
        this.student = student;
    }

    public int getId() {
        return Id;
    }

    public Course getCourseName() {
        return courseName;
    }

    public void setCourseName(Course courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }


    public Student getStudents() {
        return student;
    }

    public void setStudent(Student students) {
        this.student = student;
    }
}






