package com.cockroach.cockcms.cms.dao.main;

import com.cockroach.cockcms.cms.entity.main.ContentExt;
import com.cockroach.cockcms.common.hibernate3.Updater;

public interface ContentExtDao {
	public ContentExt findById(Integer id);

	public ContentExt save(ContentExt bean);

	public ContentExt updateByUpdater(Updater<ContentExt> updater);
}