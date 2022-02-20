package edu.dao;

import edu.pojo.Student;

import java.util.List;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/8 17:07
 * @email p2hemia@nyist.edu.cn
 **/
public interface StudentMapper {

    //查询所有的学生信息，以及对应的老师的信息
    public List<Student> getStudent();


    public List<Student> getStudent2();
}
