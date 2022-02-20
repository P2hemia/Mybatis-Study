import edu.dao.StudentMapper;
import edu.dao.TeacherMapper;
import edu.pojo.Student;
import edu.pojo.Teacher;
import edu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/8 17:18
 * @email p2hemia@nyist.edu.cn
 **/
public class MyTest {

    @Test
    public void getTeacher() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void getStudent() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        for (Student student : mapper.getStudent()) {
            System.out.println(student);
        }
        sqlSession.close();

    }
    @Test
    public void getStudent2() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        for (Student student : mapper.getStudent2()) {
            System.out.println(student);
        }
        sqlSession.close();

    }
}
