package com.cockroach.cockcms.core.dao.impl;

import org.springframework.stereotype.Repository;

import com.cockroach.cockcms.common.hibernate3.HibernateBaseDao;
import com.cockroach.cockcms.core.dao.CmsUserResumeDao;
import com.cockroach.cockcms.core.entity.CmsUserResume;

@Repository
public class CmsUserResumeDaoImpl extends HibernateBaseDao<CmsUserResume, Integer> implements CmsUserResumeDao {
	public CmsUserResume findById(Integer id) {
		CmsUserResume entity = get(id);
		return entity;
	}

	public CmsUserResume save(CmsUserResume bean) {
		getSession().save(bean);
		return bean;
	}
	
	@Override
	protected Class<CmsUserResume> getEntityClass() {
		return CmsUserResume.class;
	}
}