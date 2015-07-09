package com.cockroach.cockcms.cms.dao.assist;

import java.util.List;

import com.cockroach.cockcms.cms.entity.assist.CmsSensitivity;
import com.cockroach.cockcms.common.hibernate3.Updater;

public interface CmsSensitivityDao {
	public List<CmsSensitivity> getList(boolean cacheable);

	public CmsSensitivity findById(Integer id);

	public CmsSensitivity save(CmsSensitivity bean);

	public CmsSensitivity updateByUpdater(Updater<CmsSensitivity> updater);

	public CmsSensitivity deleteById(Integer id);
}