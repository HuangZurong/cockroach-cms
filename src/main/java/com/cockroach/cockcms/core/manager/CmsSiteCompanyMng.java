package com.cockroach.cockcms.core.manager;

import com.cockroach.cockcms.core.entity.CmsSite;
import com.cockroach.cockcms.core.entity.CmsSiteCompany;

public interface CmsSiteCompanyMng {
	public CmsSiteCompany save(CmsSite site, CmsSiteCompany bean);

	public CmsSiteCompany update(CmsSiteCompany bean);
}