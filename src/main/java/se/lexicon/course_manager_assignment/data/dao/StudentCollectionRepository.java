package se.lexicon.course_manager_assignment.data.dao;



import se.lexicon.course_manager_assignment.model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import static se.lexicon.course_manager_assignment.data.sequencers.StudentSequencer.nextStudentId;


public class StudentCollectionRepository implements StudentDao {

    private Collection<Student> students;

    public StudentCollectionRepository(Collection<Student> students) {
        this.students = students;
    }

    @Override
    public Student createStudent(String name, String email, String address) {
        return new Student(nextStudentId(), name, email, address);                /////////////////////////// student ska returneras???

    }

    @Override
    public Student findByEmailIgnoreCase(String email) { ////////////////////////////////////////////
        for (Student student : students) {
            if (student.getEmail().equalsIgnoreCase(email)) {
                return student;
            }
        }
        return null;
    }


    @Override
    public Collection<Student> findByNameContains(String name) {    ////// FEEEEEEEEL
        ArrayList<Student> matchStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                matchStudents.add(student);
            }
        }
        return matchStudents;
    }

    @Override
    public Student findById(int id){           ///////////////////////////////////////////////
            for (Student student : students) {
                if (student.getId() == id) {
                    return student;
                }
            }
            return null;
        }


    @Override
    public Collection<Student> findAll() {      //ContainsALL()
        return null;
    }

    @Override
    public boolean removeStudent(Student student) {     //remove()
        return false;
    }

    @Override
    public void clear() {
        this.students = new HashSet<>();
    }
}
