package com.cockroach.cockcms.cms.dao.main;

import com.cockroach.cockcms.cms.entity.main.ContentCheck;
import com.cockroach.cockcms.common.hibernate3.Updater;

public interface ContentCheckDao {
	public ContentCheck findById(Long id);

	public ContentCheck save(ContentCheck bean);

	public ContentCheck updateByUpdater(Updater<ContentCheck> updater);
}