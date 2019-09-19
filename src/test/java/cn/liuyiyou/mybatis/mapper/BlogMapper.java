package cn.liuyiyou.mybatis.mapper;

import cn.liuyiyou.mybatis.domain.Blog;

/**
 * @author: liuyiyou.cn
 * @date: 2019/9/19
 * @version: V1.0
 */
public interface BlogMapper {

    Blog selectBlog(int id);
}
