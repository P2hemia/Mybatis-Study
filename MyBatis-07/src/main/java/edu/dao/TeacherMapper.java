package edu.dao;

import edu.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/8 17:07
 * @email p2hemia@nyist.edu.cn
 **/
public interface TeacherMapper {

    //获取老师
    List<Teacher> getTeacher();

    //获取指定老师下所有学生以及老师的信息
    Teacher getTeacher2(@Param("tid") int id);
    Teacher getTeacher3(@Param("tid") int id);
}
