package com.cockroach.cockcms.core.dao;

import com.cockroach.cockcms.common.hibernate3.Updater;
import com.cockroach.cockcms.core.entity.CmsSiteCompany;

public interface CmsSiteCompanyDao {

	public CmsSiteCompany save(CmsSiteCompany bean);

	public CmsSiteCompany updateByUpdater(Updater<CmsSiteCompany> updater);
}