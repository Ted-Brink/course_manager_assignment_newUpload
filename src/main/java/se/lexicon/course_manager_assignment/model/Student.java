package se.lexicon.course_manager_assignment.model;

public class Student {

    int Id;
    String name;
    String email;
    String address;

    Id = nextStudentId();


    public Student(int id, String name, String email, String address) {
        Id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    // @overide
    //boolean equals(obj){}
    //int hashcode(){}

    // String toString


    public int getId() {

        return Id;
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
}