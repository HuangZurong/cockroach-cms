package com.cockroach.cockcms.cms.manager.assist;

import com.cockroach.cockcms.common.page.Pagination;
import com.cockroach.cockcms.cms.entity.assist.CmsJobApply;

public interface CmsJobApplyMng {
	public Pagination getPage(Integer userId, Integer contentId, Integer siteId, boolean cacheable, int pageNo, int pageSize);

	public CmsJobApply findById(Integer id);

	public CmsJobApply save(CmsJobApply bean);

	public CmsJobApply update(CmsJobApply bean);

	public CmsJobApply deleteById(Integer id);
	
	public CmsJobApply[] deleteByIds(Integer[] ids);
}