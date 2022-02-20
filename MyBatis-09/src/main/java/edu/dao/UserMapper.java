package edu.dao;

import edu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/11 21:47
 * @email p2hemia@nyist.edu.cn
 **/
@SuppressWarnings("all")
public interface UserMapper {

    //根据id查询用户
    List<User> queryUsersById(@Param("id") int id);
}
