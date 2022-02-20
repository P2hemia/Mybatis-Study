package nyist.edu.dao;





import nyist.edu.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2021/11/27 10:15
 * @email p2hemia@nyist.edu.cn
 **/
public interface UserMapper {

    //查询全部用户
    List<User> getUserList();

    //根据id查询用户
    User getUserById(int id);

    //insert一个用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除一个用户
    int deleteUser(int id);

    //分页功能
    List<User> getUserByLimit(Map<String,Integer> map);

    //分页功能2
    List<User> getUserByRowBounds(Map<String,Integer> map);

}
