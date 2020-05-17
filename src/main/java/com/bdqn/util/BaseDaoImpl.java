package com.bdqn.util;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BaseDaoImpl<T> implements BaseDao<T> {

	@Resource
	private SessionFactory sessionFactory;
	//获取session
	public Session getSession(){
		//获取的session不需要关闭，当前有session，使用当前session，没有开启一个session。
		return sessionFactory.getCurrentSession();
	}



	//设置参数
	public void setParams(Query q,Object[] objs){
		if(null!=objs){
			for(int i=0;i<objs.length;i++){
				q.setParameter(i, objs[i]);
			}
		}
	}
	@Override
	public boolean insert(Object obj) {
		// TODO Auto-generated method stub
		Session session=null;
		try {
			session=getSession();
			session.save(obj);
			return true;
		} catch (Exception e) {
			// TODO: handle exception

			return false;
		}
	}

	@Override
	public boolean del(Class<T> clazz,int id) {
		// TODO Auto-generated method stub
		Session session=null;
		try {
			session=getSession();
			session.delete(session.get(clazz, id));
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	@Override
	public boolean upd(Object obj) {
		// TODO Auto-generated method stub
		Session session=null;
		try {
			session=getSession();
			session.update(obj);
			return true;
		} catch (Exception e) {
			// TODO: handle exception

			return false;
		}
	}

	@Override
	public List<T> find(String hql, Object[] objs) {
		// TODO Auto-generated method stub
		Session session=null;
		List<T> list=new ArrayList<T>();
		try {
			session=getSession();
			Query q=session.createQuery(hql);
			setParams(q, objs);
			list=q.list();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
		return list;
	}

	@Override
	public T findOne(Class<T> clazz,int id) {
		// TODO Auto-generated method stub
		Session session=null;
		try {
			session=getSession();
			return (T)session.get(clazz,id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public List<T> findPage(String hql, Object[] objs, int pageSize, int pageNo) {
		// TODO Auto-generated method stub
		Session session=null;
		List<T> list=new ArrayList<T>();
		try {
			session=getSession();
			Query q=session.createQuery(hql);
			setParams(q, objs);
			q.setFirstResult((pageNo-1)*pageSize);
			q.setMaxResults(pageSize);
			list=q.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
		return list;
	}

	@Override
	public List<T> findAll(String hql) {
		Session session=null;
		List<T> list=new ArrayList<T>();
		try {
			session=getSession();
			Query q=session.createQuery(hql);
			list=q.list();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
		return list;
	}
}
