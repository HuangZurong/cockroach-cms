package com.cockroach.cockcms.cms.dao.main.impl;

import org.springframework.stereotype.Repository;

import com.cockroach.cockcms.cms.dao.main.ChannelTxtDao;
import com.cockroach.cockcms.cms.entity.main.ChannelTxt;
import com.cockroach.cockcms.common.hibernate3.HibernateBaseDao;

@Repository
public class ChannelTxtDaoImpl extends HibernateBaseDao<ChannelTxt, Integer>
		implements ChannelTxtDao {
	public ChannelTxt findById(Integer id) {
		ChannelTxt entity = get(id);
		return entity;
	}

	public ChannelTxt save(ChannelTxt bean) {
		getSession().save(bean);
		return bean;
	}

	@Override
	protected Class<ChannelTxt> getEntityClass() {
		return ChannelTxt.class;
	}
}