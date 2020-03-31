package cn.liuyiyou.mybatis.mapper;

import cn.liuyiyou.mybatis.domain.Blog;
import java.util.Map;

/**
 * @author: liuyiyou.cn
 * @date: 2019/9/19
 * @version: V1.0
 */
public interface BlogMapper {

    Blog selectBlog(Map<String,Object> params);
}
