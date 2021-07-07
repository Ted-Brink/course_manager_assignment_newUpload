package se.lexicon.course_manager_assignment.model;

import java.util.Objects;

import static se.lexicon.course_manager_assignment.data.sequencers.StudentSequencer.nextStudentId;

public class Student {

    int id;
    String name;
    String email;
    String address;


    public Student(int id, String name, String email, String address) {
        this.id = nextStudentId();
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {    // FÖRSTÅR INTE, KOLLA UPP
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}