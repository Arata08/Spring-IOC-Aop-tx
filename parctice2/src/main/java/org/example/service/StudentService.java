package org.example.service;
import org.example.pojo.Student;
import java.util.List;
/**
 * description: 学员的业务接口
 */
public interface StudentService {
    List<Student> findAll();
}
