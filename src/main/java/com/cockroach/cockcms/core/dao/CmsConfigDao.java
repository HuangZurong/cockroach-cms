package com.cockroach.cockcms.core.dao;

import com.cockroach.cockcms.common.hibernate3.Updater;
import com.cockroach.cockcms.core.entity.CmsConfig;

public interface CmsConfigDao {
	public CmsConfig findById(Integer id);

	public CmsConfig updateByUpdater(Updater<CmsConfig> updater);
}