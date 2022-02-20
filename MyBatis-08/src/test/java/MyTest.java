import edu.dao.BlogMapper;
import edu.pojo.Blog;
import edu.utils.IDutils;
import edu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/9 16:50
 * @email p2hemia@nyist.edu.cn
 **/
public class MyTest {

    public static void main(String[] args) {

        SqlSession sqlSession = MybatisUtils.getsqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();

        blog.setId(IDutils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBook(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Java");
        mapper.addBook(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Spring");
        mapper.addBook(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("微服务");
        mapper.addBook(blog);

        sqlSession.close();
    }

    @Test
    public void queryBlogIF() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
//        hashMap.put("title","Java");
        hashMap.put("author","狂神说");
        List<Blog> blogs = mapper.queryBlogIF(hashMap);
        System.out.println(blogs);
        sqlSession.close();
    }

    @Test
    public void queryBlogChoose() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("title","Java");
//        hashMap.put("author","狂神说");
        hashMap.put("views","1000");
        List<Blog> blogs = mapper.queryBlogChoose(hashMap);
        System.out.println(blogs);
        sqlSession.close();
    }

    @Test
    public void updateBlog() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("title","JavaScript");
        hashMap.put("author","张三");
        hashMap.put("id","72195e6d9efd4a78849f3b7b7dbe6260");
        mapper.updateBlog(hashMap);
        sqlSession.close();
    }


    @Test
    public void queryBlogForEach() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        ArrayList<Integer> ids = new ArrayList<>();
        map.put("ids",ids);

        ids.add(1);
        List<Blog> blogs = mapper.queryBlogForEach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
