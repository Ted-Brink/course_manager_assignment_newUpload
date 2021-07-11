package se.lexicon.course_manager_assignment.model;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import static se.lexicon.course_manager_assignment.data.sequencers.CourseSequencer.nextCourseId;

public class Course {


    int id;
    String courseName;
    LocalDate startDate;
    int weekDuration;
    Student student;
    private List<Student> students; // Collection<Student>


    public Course(int id, String courseName, LocalDate startDate, int weekDuration, Student student) {
        this.id = id;
        this.courseName = courseName;
        this.startDate = startDate;
        this.weekDuration = weekDuration;
        this.student = student;
    }

    public Course(int id, String courseName, LocalDate startDate, int weekDuration) {
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }


    public Student getStudents() {          // Collection<Student>
        return student;
    }

    public void setStudents(Student student) {
        this.student = student;
    }

    //public boolean enrollStudent(Student student) {   // Add Student ej duplicate eller null, return true or false
    public boolean  enrollStudent(Student student){

        if(students.contains(student))
            return false;
        else
        return students.add(student);         // Metod för kontroll av null eller duplicate behövs

    }


    public boolean unenrollStudent(Student student) {

        return students.remove(student);
    }

    // @Override, equals, hashCode, toString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id && weekDuration == course.weekDuration && Objects.equals(courseName, course.courseName)
                && Objects.equals(startDate, course.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, courseName, startDate, weekDuration);
    }


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", startDate=" + startDate +
                ", weekDuration=" + weekDuration +
                ", students=" + students +
                '}';
    }

}






