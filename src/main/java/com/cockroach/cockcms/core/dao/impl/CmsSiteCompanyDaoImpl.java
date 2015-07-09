package com.cockroach.cockcms.core.dao.impl;

import org.springframework.stereotype.Repository;

import com.cockroach.cockcms.common.hibernate3.HibernateBaseDao;
import com.cockroach.cockcms.core.dao.CmsSiteCompanyDao;
import com.cockroach.cockcms.core.entity.CmsSiteCompany;

@Repository
public class CmsSiteCompanyDaoImpl extends
		HibernateBaseDao<CmsSiteCompany, Integer> implements CmsSiteCompanyDao {

	public CmsSiteCompany save(CmsSiteCompany bean) {
		getSession().save(bean);
		return bean;
	}

	@Override
	protected Class<CmsSiteCompany> getEntityClass() {
		return CmsSiteCompany.class;
	}
}