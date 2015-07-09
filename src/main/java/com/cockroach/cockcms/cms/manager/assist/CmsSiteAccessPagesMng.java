package com.cockroach.cockcms.cms.manager.assist;

import java.util.Date;

import com.cockroach.cockcms.cms.entity.assist.CmsSiteAccessPages;
import com.cockroach.cockcms.common.page.Pagination;

/**
 * @author Tom
 */
public interface CmsSiteAccessPagesMng {

	public CmsSiteAccessPages save(CmsSiteAccessPages access);
	
	public CmsSiteAccessPages update(CmsSiteAccessPages access);

	public CmsSiteAccessPages findAccessPage(String sessionId, Integer pageIndex);
	
	public Pagination findPages(Integer siteId, Integer orderBy, Integer pageNo, Integer pageSize);

	public void clearByDate(Date date);
}
