package com.cockroach.cockcms.core.manager;

import com.cockroach.cockcms.core.entity.CmsUser;
import com.cockroach.cockcms.core.entity.CmsUserExt;

public interface CmsUserExtMng {
	public CmsUserExt save(CmsUserExt ext, CmsUser user);

	public CmsUserExt update(CmsUserExt ext, CmsUser user);
}