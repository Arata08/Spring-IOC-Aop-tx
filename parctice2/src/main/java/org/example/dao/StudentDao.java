package org.example.dao;

import org.example.pojo.Student;
import java.util.List;

/**
 * description: 学员持久层访问接口
 */
public interface StudentDao {

    List<Student> queryAll();
}
