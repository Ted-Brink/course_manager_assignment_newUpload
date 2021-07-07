package se.lexicon.course_manager_assignment.model;
import java.time.LocalDate;

import static se.lexicon.course_manager_assignment.data.sequencers.CourseSequencer.nextCourseId;

public class Course {


    int id;
    String courseName;
    LocalDate startDate;
    int weekDuration;
    Student students;   // Collection<Student>

    public Course(int id, String courseName, LocalDate startDate, int weekDuration, Student student) {
        this.id = nextCourseId();
        this.courseName = courseName;
        this.startDate = startDate;
        this.weekDuration = weekDuration;
        this.students = students;
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
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }
  /*
    public boolean enrollStudent(Student student) {   // Add Student obj ej duplicate eller null, return true or false
    }

    public boolean unenrollStudent(Student student) {// Remove a Student.class object, return true When obj removed

    }

    @Override
    equals
    hashCode
    toString

 */



}






