package org.example.ioc_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
}
