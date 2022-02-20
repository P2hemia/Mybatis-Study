package edu.dao;

import edu.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/8 17:07
 * @email p2hemia@nyist.edu.cn
 **/
public interface TeacherMapper {

    @Select("select * from teacher where id=#{tid}")
    Teacher getTeacher(@Param("tid") int id);
}
