package cn.nyist.edu.dao;

import cn.nyist.edu.pojo.User;
import cn.nyist.edu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2021/11/27 8:31
 * @email p2hemia@nyist.edu.cn
 **/
public class UserDaoTest {



    @Test
    public void getUserLike() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userLike = mapper.getUserLike("%李%");
        for (User user : userLike) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void test() {
        //第一步：获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        //方式1：getMapper     执行SQL
        UserMapper userdao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userdao.getUserList();

//        //方式2：
//        List<User> userList = sqlSession.selectList("cn.nyist.edu.dao.UserDao.getUserList");

        for (User user : userList) {
            System.out.println(user);
        }


        //关闭sqlsession
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        //第一步：获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getsqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(1);

        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void getUserById2(){
        //第一步：获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getsqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<>();

        map.put("id",1);
        map.put("name","狂神");

        User user = mapper.getUserById2(map);
        System.out.println(user);

        sqlSession.close();
    }

//  增删改需要提交事务
    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int user = mapper.addUser(new User(4, "鲁班七号", "123123"));

        if(user>0) {
            System.out.println("插入成功！");
        }

//        提交事务
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void addUser2() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<>();
        map.put("userid",5);
        map.put("userName","小二");
        map.put("userWord","54321");


        mapper.addUser2(map);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.updateUser(new User(4,"小卤蛋","1234"));

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(4);

        sqlSession.commit();
        sqlSession.close();
    }
}
