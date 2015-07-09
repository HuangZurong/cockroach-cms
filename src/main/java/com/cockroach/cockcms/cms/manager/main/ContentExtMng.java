package com.cockroach.cockcms.cms.manager.main;

import com.cockroach.cockcms.cms.entity.main.Content;
import com.cockroach.cockcms.cms.entity.main.ContentExt;

public interface ContentExtMng {
	public ContentExt save(ContentExt ext, Content content);

	public ContentExt update(ContentExt ext);
}