package com.cockroach.cockcms.cms.dao.assist;

import com.cockroach.cockcms.common.hibernate3.Updater;
import com.cockroach.cockcms.common.page.Pagination;
import com.cockroach.cockcms.cms.entity.assist.CmsScoreItem;

public interface CmsScoreItemDao {
	public Pagination getPage(Integer groupId, int pageNo, int pageSize);

	public CmsScoreItem findById(Integer id);

	public CmsScoreItem save(CmsScoreItem bean);

	public CmsScoreItem updateByUpdater(Updater<CmsScoreItem> updater);

	public CmsScoreItem deleteById(Integer id);
}