package com.cockroach.cockcms.cms.manager.assist;

import java.util.List;

import net.sf.ehcache.Ehcache;

import com.cockroach.cockcms.common.page.Pagination;
import com.cockroach.cockcms.cms.entity.assist.CmsSearchWords;

public interface CmsSearchWordsMng {
	public Pagination getPage(int pageNo, int pageSize);

	public List<CmsSearchWords> getList(String name, Integer orderBy, boolean cacheable);
	
	public CmsSearchWords findById(Integer id);

	public CmsSearchWords save(CmsSearchWords bean);

	public CmsSearchWords update(CmsSearchWords bean);

	public CmsSearchWords deleteById(Integer id);
	
	public CmsSearchWords[] deleteByIds(Integer[] ids);
	
	public int freshCacheToDB(Ehcache cache);

}