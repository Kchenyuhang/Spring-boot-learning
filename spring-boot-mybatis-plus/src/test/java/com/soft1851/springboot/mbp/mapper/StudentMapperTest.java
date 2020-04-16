package com.soft1851.springboot.mbp.mapper;

import com.soft1851.springboot.mbp.entity.Rank;
import com.soft1851.springboot.mbp.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.sql.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/16
 */
@SpringBootTest
class StudentMapperTest {

    @Resource
    private StudentMapper studentMapper;

    @Test
    void testSelectAll() {
        List<Student> students = studentMapper.selectList(null);
        students.forEach(System.out::println);
    }

    @Test
    void testSelectById() {
        Student students = studentMapper.selectById(1001);
        System.out.println(students);
    }

    @Test
    void testDeleteById() {
        System.out.println(studentMapper.deleteById(6008));

    }

    @Test
    void testInsert() {
        Student student = new Student();
        student.setClazzId(2);
        student.setStudentName("Saber");
        student.setHometown("测试");
        student.setBirthday(new Date(2019-10-10));
        int n = studentMapper.insert(student);
        System.out.println(n);
    }
}