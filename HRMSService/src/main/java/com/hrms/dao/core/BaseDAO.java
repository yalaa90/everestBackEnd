package com.hrms.dao.core;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.hrms.entities.core.BaseEntity;

public abstract class BaseDAO<T extends BaseEntity, pk extends Serializable> implements IBaseDAO<T, pk> {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session session;

	protected Class<T> EntityClass= ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);;;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void a() {

	}

	@Override
	public void save(final T entity) { // todo aop
		Assert.notNull(entity);
		getSession().save(entity);

	}

	@Override
	public void delete(final T entity) {
		Assert.notNull(entity);
		getSession().delete(entity);

	}

	@Override
	public void delete(final pk id) {
		Assert.notNull(id);
		T entity = get(id);
		getSession().delete(entity);

	}

	@Override
	public T findActives() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findByUser(final String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T get(pk id) {
			 
		Assert.notNull(id);
		return getSession().get(EntityClass, id);
	}

	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
		return getSession().createCriteria(EntityClass).list();
	}

}
