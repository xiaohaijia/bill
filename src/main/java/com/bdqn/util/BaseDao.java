package com.bdqn.util;

import java.util.List;

public interface BaseDao<T> {

	//添加
	public boolean insert(Object obj);

	//删除
	public boolean del(Class<T> clazz, int id);

	//修改
	public boolean upd(Object obj);

	//查询hql
	public List<T> find(String hql, Object[] objs);

	//查询hql,查询全部
	public List<T> findAll(String hql);

	//根据主键查询
	public  T findOne(Class<T> clazz, int id);

	//分页查询
	public List<T> findPage(String hql, Object[] objs, int pageSize, int pageNo);
}
