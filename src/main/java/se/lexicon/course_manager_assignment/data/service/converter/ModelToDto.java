package se.lexicon.course_manager_assignment.data.service.converter;

import org.springframework.stereotype.Component;
import se.lexicon.course_manager_assignment.dto.views.CourseView;
import se.lexicon.course_manager_assignment.dto.views.StudentView;
import se.lexicon.course_manager_assignment.model.Course;
import se.lexicon.course_manager_assignment.model.Student;


import java.util.Collection;
import java.util.List;

@Component
public class ModelToDto implements Converters {
    @Override
    public StudentView studentToStudentView(Student student) {
        return studentToStudentView(student);
    }

    @Override
    public CourseView courseToCourseView(Course course) {
        return courseToCourseView(course);
    }

    @Override
    public List<CourseView> coursesToCourseViews(Collection<Course> courses) {

        return coursesToCourseViews(courses);
    }

    @Override
    public List<StudentView> studentsToStudentViews(Collection<Student> students) {

        return studentsToStudentViews(students);
    }
}
