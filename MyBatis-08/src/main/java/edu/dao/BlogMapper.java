package edu.dao;

import edu.pojo.Blog;

import java.sql.Blob;
import java.util.List;
import java.util.Map;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/9 16:31
 * @email p2hemia@nyist.edu.cn
 **/
public interface BlogMapper {
    //插入数据
    int addBook(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);

    //更新博客
    int updateBlog(Map map);

    //查询博客第1、2、3号的记录
    List<Blog> queryBlogForEach(Map map);
}
