package com.cockroach.cockcms.cms.manager.assist;

import com.cockroach.cockcms.common.page.Pagination;
import com.cockroach.cockcms.cms.entity.assist.CmsScoreItem;

public interface CmsScoreItemMng {
	public Pagination getPage(Integer groupId, int pageNo, int pageSize);

	public CmsScoreItem findById(Integer id);

	public CmsScoreItem save(CmsScoreItem bean);

	public CmsScoreItem update(CmsScoreItem bean);

	public CmsScoreItem deleteById(Integer id);
	
	public CmsScoreItem[] deleteByIds(Integer[] ids);
}