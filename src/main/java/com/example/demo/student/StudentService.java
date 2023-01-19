package com.example.demo.student;



import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudentsList() {
        return List.of(
                new Student(
                        1L,
                        "Jan",
                        "Jan_Kowalski@gmail.com",
                        LocalDate.of(1995, Month.JUNE,10),
                        27
                )
        );
    }
}
