package nyist.edu;


import nyist.edu.dao.UserMapper;
import nyist.edu.pojo.User;
import nyist.edu.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2021/12/1 14:10
 * @email p2hemia@nyist.edu.cn
 **/
public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);
//
//    //      1、getUserList查看所有列表
//    @Test
//    public void getUserList() {
//        SqlSession sqlSession = MybatisUtils.getsqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        for (User user : mapper.getUserList()) {
//            System.out.println(user);
//        }
//
//        sqlSession.close();
//    }

    //      2、getUserById根据ID查看某个列表
    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User userById = mapper.getUserById(1);
        System.out.println(userById);

        sqlSession.close();
    }

//    @Test
//    public void testLog4j() {
//        logger.info("info进入了testLog4j方法");
//        logger.debug("debug进入了testLog4j方法");
//        logger.error("error进入了testLog4j方法");
//    }

    @Test
    public void getUserByLimit() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex",1);
        map.put("pageSize",2);
        List<User> userByLimit = mapper.getUserByLimit(map);
        for (User user : userByLimit) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void getUserByRowBounds() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        //RowBounds实现
        RowBounds rowBounds = new RowBounds(1,2);


        //通过Java代码层面实现分页
        List<User> userList = sqlSession.selectList("nyist.edu.dao.UserMapper.getUserByRowBounds",null,rowBounds);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

//    //      3、addUser添加一个元素
//    @Test
//    public void addUser() {
//        SqlSession sqlSession = MybatisUtils.getsqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        int user = mapper.addUser(new User(8, "罗翔", "22222"));
//        if(user>0) {
//            System.out.println("插入成功");
//
//        }
//        //提交事务
//        sqlSession.commit();
//        sqlSession.close();
//    }
//
//
//    //      4、updateUser更改一个元素
//    @Test
//    public void updateUser() {
//        SqlSession sqlSession = MybatisUtils.getsqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        mapper.updateUser(new User(4, "haha", "123123"));
//        sqlSession.commit();
//        sqlSession.close();
//    }
//
//    //      5、deleteUser删除一个元素
//    @Test
//    public void deleteUser() {
//        SqlSession sqlSession = MybatisUtils.getsqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        mapper.deleteUser(8);
//        sqlSession.commit();
//        sqlSession.close();
//    }
//

}
