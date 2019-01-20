package com.krishantha.rentacar.demoapplication.service;

import com.krishantha.rentacar.demoapplication.model.Student;

public interface StudentService {


    Student save(Student student);
    public Student fetchStudentById(int id);

}
