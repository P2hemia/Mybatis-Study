import edu.dao.TeacherMapper;
import edu.pojo.Teacher;
import edu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/8 22:48
 * @email p2hemia@nyist.edu.cn
 **/
public class MyTest {


    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        for (Teacher teacher : mapper.getTeacher()) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }

    @Test
    public void getTeacher2() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher2 = mapper.getTeacher2(1);
        System.out.println(teacher2);
        sqlSession.close();
    }

    @Test
    public void getTeacher3() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher2 = mapper.getTeacher3(1);
        System.out.println(teacher2);
        sqlSession.close();
    }
}
