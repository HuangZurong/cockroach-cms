package com.cockroach.cockcms.cms.dao.main;

import com.cockroach.cockcms.cms.entity.main.ContentTxt;
import com.cockroach.cockcms.common.hibernate3.Updater;

public interface ContentTxtDao {
	public ContentTxt findById(Integer id);

	public ContentTxt save(ContentTxt bean);

	public ContentTxt updateByUpdater(Updater<ContentTxt> updater);
}