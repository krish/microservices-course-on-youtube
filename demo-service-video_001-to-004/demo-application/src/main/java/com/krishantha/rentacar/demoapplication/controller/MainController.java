package com.krishantha.rentacar.demoapplication.controller;


import com.krishantha.rentacar.demoapplication.model.Student;
import com.krishantha.rentacar.demoapplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting() {
        return "Hello Springboot";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greeting2() {
        return "Hello Springboot from POST";
    }


    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student) {

        return studentService.save(student);
    }

    @RequestMapping(value = "/student",method = RequestMethod.GET)
  public ResponseEntity<Student> fetchStudent(@RequestParam int id){

        Student student= studentService.fetchStudentById(id);
        if(student==null){
          return   ResponseEntity.notFound().build();
        }else{
            return  ResponseEntity.ok().body(student);
        }
  }
}
