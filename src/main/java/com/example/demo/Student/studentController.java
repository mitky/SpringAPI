package com.example.demo.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class studentController {

    private final studentService stService;

    @Autowired
    public studentController(studentService stService) {
        this.stService = stService;
    }

    @GetMapping
    public List<student> getStudents() {
        return stService.getStudents();
    }

}
