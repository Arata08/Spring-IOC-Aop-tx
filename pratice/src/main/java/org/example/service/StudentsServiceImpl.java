package org.example.service;

import org.example.dao.StudentDao;
import org.example.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author UserName
 */
@Service
public class StudentsServiceImpl implements StudentService {
    private StudentDao studentDao;

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
        return studentDao.queryAll();
    }
}
