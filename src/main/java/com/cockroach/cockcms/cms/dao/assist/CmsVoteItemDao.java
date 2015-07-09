package com.cockroach.cockcms.cms.dao.assist;

import com.cockroach.cockcms.cms.entity.assist.CmsVoteItem;
import com.cockroach.cockcms.common.hibernate3.Updater;
import com.cockroach.cockcms.common.page.Pagination;

public interface CmsVoteItemDao {
	public Pagination getPage(int pageNo, int pageSize);

	public CmsVoteItem findById(Integer id);

	public CmsVoteItem save(CmsVoteItem bean);

	public CmsVoteItem updateByUpdater(Updater<CmsVoteItem> updater);

	public CmsVoteItem deleteById(Integer id);
}