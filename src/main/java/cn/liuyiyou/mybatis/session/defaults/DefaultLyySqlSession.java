package cn.liuyiyou.mybatis.session.defaults;

import cn.liuyiyou.mybatis.executor.MyExecutor;
import cn.liuyiyou.mybatis.session.MyConfiguration;
import cn.liuyiyou.mybatis.session.MyResultHandler;
import cn.liuyiyou.mybatis.session.MySqlSession;
import java.sql.Connection;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.RowBounds;

/**
 * @author: liuyiyou.cn
 * @date: 2020/3/31
 * @version: V1.0
 */
public class DefaultLyySqlSession implements MySqlSession {

  private MyConfiguration configuration;
  private MyExecutor executor;

  @Override
  public <T> T selectOne(String statement) {
    return null;
  }

  @Override
  public <T> T selectOne(String statement, Object parameter) {
    return null;
  }

  @Override
  public <E> List<E> selectList(String statement) {
    return null;
  }

  @Override
  public <E> List<E> selectList(String statement, Object parameter) {
    return null;
  }

  @Override
  public <E> List<E> selectList(String statement, Object parameter, RowBounds rowBounds) {
    return null;
  }

  @Override
  public <K, V> Map<K, V> selectMap(String statement, String mapKey) {
    return null;
  }

  @Override
  public <K, V> Map<K, V> selectMap(String statement, Object parameter, String mapKey) {
    return null;
  }

  @Override
  public <K, V> Map<K, V> selectMap(String statement, Object parameter, String mapKey,
      RowBounds rowBounds) {
    return null;
  }

  @Override
  public <T> Cursor<T> selectCursor(String statement) {
    return null;
  }

  @Override
  public <T> Cursor<T> selectCursor(String statement, Object parameter) {
    return null;
  }

  @Override
  public <T> Cursor<T> selectCursor(String statement, Object parameter, RowBounds rowBounds) {
    return null;
  }

  @Override
  public void select(String statement, Object parameter, MyResultHandler handler) {

  }

  @Override
  public void select(String statement, MyResultHandler handler) {

  }

  @Override
  public void select(String statement, Object parameter, RowBounds rowBounds,
      MyResultHandler handler) {

  }

  @Override
  public int insert(String statement) {
    return 0;
  }

  @Override
  public int insert(String statement, Object parameter) {
    return 0;
  }

  @Override
  public int update(String statement) {
    return 0;
  }

  @Override
  public int update(String statement, Object parameter) {
    return 0;
  }

  @Override
  public int delete(String statement) {
    return 0;
  }

  @Override
  public int delete(String statement, Object parameter) {
    return 0;
  }

  @Override
  public void commit() {

  }

  @Override
  public void commit(boolean force) {

  }

  @Override
  public void rollback() {

  }

  @Override
  public void rollback(boolean force) {

  }

  @Override
  public List<BatchResult> flushStatements() {
    return null;
  }

  @Override
  public void close() {

  }

  @Override
  public void clearCache() {

  }

  @Override
  public MyConfiguration getConfiguration() {
    return null;
  }

  @Override
  public <T> T getMapper(Class<T> type) {
    return null;
  }

  @Override
  public Connection getConnection() {
    return null;
  }
}
