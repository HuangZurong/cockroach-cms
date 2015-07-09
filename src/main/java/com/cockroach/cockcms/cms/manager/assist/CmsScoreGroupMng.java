package com.cockroach.cockcms.cms.manager.assist;

import com.cockroach.cockcms.common.page.Pagination;
import com.cockroach.cockcms.cms.entity.assist.CmsScoreGroup;

public interface CmsScoreGroupMng {
	public Pagination getPage(int pageNo, int pageSize);

	public CmsScoreGroup findById(Integer id);
	
	public CmsScoreGroup findDefault(Integer siteId);

	public CmsScoreGroup save(CmsScoreGroup bean);

	public CmsScoreGroup update(CmsScoreGroup bean);

	public CmsScoreGroup deleteById(Integer id);
	
	public CmsScoreGroup[] deleteByIds(Integer[] ids);
}