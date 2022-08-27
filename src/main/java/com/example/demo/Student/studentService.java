package com.example.demo.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class studentService {

    public List<student> getStudents() {
        return List.of(
                new student(
                        1L,
                        "Mitky",
                        27,
                        LocalDate.of(1995, Month.SEPTEMBER, 4),
                        "dimitar.shikrenov@gmail.com"));
    }

}
