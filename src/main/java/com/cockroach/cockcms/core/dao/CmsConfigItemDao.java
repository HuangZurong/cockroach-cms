package com.cockroach.cockcms.core.dao;

import java.util.List;

import com.cockroach.cockcms.common.hibernate3.Updater;
import com.cockroach.cockcms.core.entity.CmsConfigItem;

public interface CmsConfigItemDao {
	public List<CmsConfigItem> getList(Integer configId, Integer category);

	public CmsConfigItem findById(Integer id);

	public CmsConfigItem save(CmsConfigItem bean);

	public CmsConfigItem updateByUpdater(Updater<CmsConfigItem> updater);

	public CmsConfigItem deleteById(Integer id);
}