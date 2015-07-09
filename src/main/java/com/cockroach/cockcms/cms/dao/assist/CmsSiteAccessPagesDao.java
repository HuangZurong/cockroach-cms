package com.cockroach.cockcms.cms.dao.assist;

import java.util.Date;

import com.cockroach.cockcms.cms.entity.assist.CmsSiteAccessPages;
import com.cockroach.cockcms.common.hibernate3.Updater;
import com.cockroach.cockcms.common.page.Pagination;

/**
 * @author Tom
 */
public interface CmsSiteAccessPagesDao {

	public CmsSiteAccessPages findAccessPage(String sessionId, Integer pageIndex);
	
	public Pagination findPages(Integer siteId, Integer orderBy, Integer pageNo, Integer pageSize);

	public CmsSiteAccessPages save(CmsSiteAccessPages access);

	public CmsSiteAccessPages updateByUpdater(Updater<CmsSiteAccessPages> updater);

	public void clearByDate(Date date);

}
