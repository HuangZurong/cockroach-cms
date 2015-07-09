package com.cockroach.cockcms.cms.manager.assist;

import java.util.List;

import com.cockroach.cockcms.common.page.Pagination;
import com.cockroach.cockcms.cms.entity.assist.CmsPlug;

public interface CmsPlugMng {
	public Pagination getPage(int pageNo, int pageSize);
	
	public List<CmsPlug> getList(String author, Boolean used);

	public CmsPlug findById(Integer id);
	
	public CmsPlug findByPath(String plugPath);

	public CmsPlug save(CmsPlug bean);

	public CmsPlug update(CmsPlug bean);

	public CmsPlug deleteById(Integer id);
	
	public CmsPlug[] deleteByIds(Integer[] ids);
}