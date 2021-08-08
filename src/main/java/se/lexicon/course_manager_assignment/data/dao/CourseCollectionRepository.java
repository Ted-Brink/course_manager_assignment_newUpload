package se.lexicon.course_manager_assignment.data.dao;



import se.lexicon.course_manager_assignment.model.Course;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import static se.lexicon.course_manager_assignment.data.sequencers.CourseSequencer.nextCourseId;


public class CourseCollectionRepository implements CourseDao{

    private Collection<Course> courses;


    public CourseCollectionRepository(Collection<Course> courses) {
        this.courses = courses;
    }

    @Override
    public Course createCourse(String courseName, LocalDate startDate, int weekDuration) {
        return new Course(nextCourseId(), courseName, startDate, weekDuration);
    }

    @Override
    public Course findById(int id) {
        for(Course course: courses) {
            if (course.getId() == id) {
                return course;
            }
        }
        return null;
    }

    @Override
    public Collection<Course> findByNameContains(String name) {        ////////////////KOLLA UPP name??? course???
        ArrayList<Course> matchCourses = new ArrayList<>();
        for (Course course : courses) {
            if (course.getCourseName().toLowerCase().contains(name.toLowerCase())) {
                matchCourses.add(course);
            }
        }
        return matchCourses;
    }


    @Override
    public Collection<Course> findByDateBefore(LocalDate end) {
        ArrayList<Course> dateBefore = new ArrayList<>();
        for (Course course : courses) {
            if (course.getStartDate().isBefore(end))  {
                dateBefore.add(course);
            }
        }
        return dateBefore;
    }

    @Override
    public Collection<Course> findByDateAfter(LocalDate start) {
        ArrayList<Course> dateAfter = new ArrayList<>();
        for (Course course : courses) {
            if(course.getStartDate().isAfter(start)) {
                dateAfter.add(course);
            }
        }
        return dateAfter;
    }

    @Override
    public Collection<Course> findAll() {                   ////////////////////// Vet Inte om det är rätt
        return courses;
    }

    @Override
    public Collection<Course> findByStudentId(int studentId) {    ///////////////// Vet inte om detta fungerar
        ArrayList<Course> findStudentId = new ArrayList<>();
        for (Course course : courses) {
            if(course.getStudents().getId() == studentId);
        }
        return courses;
    }

    @Override
    public boolean removeCourse(Course course) {
        return courses.remove(course);
    }

    @Override
    public void clear() {
        this.courses = new HashSet<>();
    }
}
