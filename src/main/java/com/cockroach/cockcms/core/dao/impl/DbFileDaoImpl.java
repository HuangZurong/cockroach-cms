package com.cockroach.cockcms.core.dao.impl;

import org.springframework.stereotype.Repository;

import com.cockroach.cockcms.common.hibernate3.HibernateBaseDao;
import com.cockroach.cockcms.core.dao.DbFileDao;
import com.cockroach.cockcms.core.entity.DbFile;

@Repository
public class DbFileDaoImpl extends HibernateBaseDao<DbFile, String> implements
		DbFileDao {
	public DbFile findById(String id) {
		DbFile entity = get(id);
		return entity;
	}

	public DbFile save(DbFile bean) {
		getSession().save(bean);
		return bean;
	}

	public DbFile deleteById(String id) {
		DbFile entity = super.get(id);
		if (entity != null) {
			getSession().delete(entity);
		}
		return entity;
	}

	@Override
	protected Class<DbFile> getEntityClass() {
		return DbFile.class;
	}
}