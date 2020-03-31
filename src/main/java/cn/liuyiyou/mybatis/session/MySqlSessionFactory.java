package cn.liuyiyou.mybatis.session;

import java.sql.Connection;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.TransactionIsolationLevel;

/**
 * @author: liuyiyou.cn
 * @date: 2020/3/31
 * @version: V1.0
 */
public interface MySqlSessionFactory {

  MySqlSession openSession();

  MySqlSession openSession(boolean autoCommit);

  MySqlSession openSession(Connection connection);

  MySqlSession openSession(TransactionIsolationLevel level);

  MySqlSession openSession(ExecutorType execType);

  MySqlSession openSession(ExecutorType execType, boolean autoCommit);

  MySqlSession openSession(ExecutorType execType, TransactionIsolationLevel level);

  MySqlSession openSession(ExecutorType execType, Connection connection);

  MyConfiguration getConfiguration();
}
