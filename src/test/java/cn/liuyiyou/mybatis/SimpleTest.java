package cn.liuyiyou.mybatis;

import cn.liuyiyou.mybatis.domain.Blog;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

/**
 * @author: liuyiyou.cn
 * @date: 2019/3/6
 * @version: V1.0
 */
public class SimpleTest {

    public SqlSessionFactory buildSqlSessionFactory() {
        try {
            String resource = "cn/liuyiyou/mybatis/mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            return sqlSessionFactory;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Test
    public void selectOne() throws IOException {
        SqlSession session = buildSqlSessionFactory().openSession();
        try {
            Blog blog = session.selectOne("cn.liuyiyou.mybatis.mapper.BlogMapper.selectBlog", 1);
            System.out.println(blog);
        } finally {
            session.close();
        }
    }

    /**
     * $和#的区别
     *
     * @throws IOException
     */
    @Test
    public void selectOneOrderBy() throws IOException {
        SqlSession session = buildSqlSessionFactory().openSession();
        try {
            HashMap<String, Object> param = new HashMap<String, Object>();
            param.put("id", 1);
            param.put("orderby", "title");
            List<Blog> blogs = session.selectList("cn.liuyiyou.mybatis.mapper.BlogMapper.selectList", param);
            System.out.println(blogs.size());
            blogs.forEach(System.out::println);
        } finally {
            session.close();
        }
    }
}
