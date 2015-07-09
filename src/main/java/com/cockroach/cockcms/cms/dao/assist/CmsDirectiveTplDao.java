package com.cockroach.cockcms.cms.dao.assist;

import java.util.List;

import com.cockroach.cockcms.common.hibernate3.Updater;
import com.cockroach.cockcms.common.page.Pagination;
import com.cockroach.cockcms.cms.entity.assist.CmsDirectiveTpl;

public interface CmsDirectiveTplDao {
	public Pagination getPage(int pageNo, int pageSize);
	
	public List<CmsDirectiveTpl> getList(int count);

	public CmsDirectiveTpl findById(Integer id);

	public CmsDirectiveTpl save(CmsDirectiveTpl bean);

	public CmsDirectiveTpl updateByUpdater(Updater<CmsDirectiveTpl> updater);

	public CmsDirectiveTpl deleteById(Integer id);
}