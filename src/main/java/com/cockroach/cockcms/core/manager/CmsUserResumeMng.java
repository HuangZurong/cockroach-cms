package com.cockroach.cockcms.core.manager;

import com.cockroach.cockcms.core.entity.CmsUser;
import com.cockroach.cockcms.core.entity.CmsUserResume;

public interface CmsUserResumeMng {
	public CmsUserResume save(CmsUserResume ext, CmsUser user);

	public CmsUserResume update(CmsUserResume ext, CmsUser user);
}