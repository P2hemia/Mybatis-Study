import edu.dao.UserMapper;
import edu.pojo.User;
import edu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/11 22:15
 * @email p2hemia@nyist.edu.cn
 **/
public class UserTest {

    @Test
    public void queryUsersById(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.queryUsersById(1);
        System.out.println(users);
        sqlSession.close();
    }
}
