package cn.itcast.scm.service;

import cn.itcast.scm.entity.Page;

public interface BaseService<T> {
	// 添加单个对象

	int insert(T entity) throws Exception;

	// 修改单个对象

	int updata(T entity) throws Exception;

	// 删除单个对象

	int delete(T entity) throws Exception;

	// 查询单个对象

	T select(T entity) throws Exception;

	// 通过关键字分页查询

	Page<T> selectPage(Page<T> page);

	// 通过关键字分页查询，返回总记录数

	Integer selecPageCount(T entity);

	// 通过主键（数组）批量删除数据

	int deleteList(String[] pks) throws Exception;

	// 通过多条件分页查询
	Page<T> selectPageUseDyc(Page<T> page);

}
