package com.cockroach.cockcms.core.dao;

import com.cockroach.cockcms.common.hibernate3.Updater;
import com.cockroach.cockcms.core.entity.CmsUserResume;

public interface CmsUserResumeDao {
	public CmsUserResume findById(Integer id);

	public CmsUserResume save(CmsUserResume bean);

	public CmsUserResume updateByUpdater(Updater<CmsUserResume> updater);
}