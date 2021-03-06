package se.lexicon.course_manager_assignment.data.service.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.lexicon.course_manager_assignment.data.dao.CourseDao;
import se.lexicon.course_manager_assignment.data.dao.StudentDao;
import se.lexicon.course_manager_assignment.data.service.converter.Converters;
import se.lexicon.course_manager_assignment.dto.forms.CreateStudentForm;
import se.lexicon.course_manager_assignment.dto.forms.UpdateStudentForm;
import se.lexicon.course_manager_assignment.dto.views.StudentView;
import se.lexicon.course_manager_assignment.model.Student;


import java.util.List;

@Service
public class StudentManager implements StudentService {

    private final StudentDao studentDao;
    private final CourseDao courseDao;
    private final Converters converters;

    @Autowired
    public StudentManager(StudentDao studentDao, CourseDao courseDao, Converters converters) {
        this.studentDao = studentDao;
        this.courseDao = courseDao;
        this.converters = converters;
    }

    @Override
    public StudentView create(CreateStudentForm form) {


      //  return converters.studentToStudentView(studentDao.createStudent());     ////////////////////////////////////
        return null;

    }

    @Override
    public StudentView update(UpdateStudentForm form) {
        return null;
    }      ///////////////////////////// Ej gjord

    @Override
    public StudentView findById(int id) {

        return converters.studentToStudentView(studentDao.findById(id));
    }

    @Override
    public StudentView searchByEmail(String email) {

        return converters.studentToStudentView(studentDao.findByEmailIgnoreCase(email));
    }

    @Override
    public List<StudentView> searchByName(String name) {
        return converters.studentsToStudentViews(studentDao.findByNameContains(name));
    }

    @Override
    public List<StudentView> findAll() {
        return converters.studentsToStudentViews(studentDao.findAll());
    }

    @Override
    public boolean deleteStudent(int id) {     /// Om id finns ta bort studenten retunrera true, else false.
        studentDao.removeStudent(studentDao.findById(id));
        return true;                            //////// Detta kommer inte fungera ska returnera false om inte id finns

    }
}
