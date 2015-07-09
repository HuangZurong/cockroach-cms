package com.cockroach.cockcms.cms.dao.main.impl;

import org.springframework.stereotype.Repository;

import com.cockroach.cockcms.cms.dao.main.ChannelExtDao;
import com.cockroach.cockcms.cms.entity.main.ChannelExt;
import com.cockroach.cockcms.common.hibernate3.HibernateBaseDao;

@Repository
public class ChannelExtDaoImpl extends HibernateBaseDao<ChannelExt, Integer>
		implements ChannelExtDao {
	public ChannelExt save(ChannelExt bean) {
		getSession().save(bean);
		return bean;
	}

	@Override
	protected Class<ChannelExt> getEntityClass() {
		return ChannelExt.class;
	}
}