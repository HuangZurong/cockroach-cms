package com.cockroach.cockcms.cms.manager.main;

import com.cockroach.cockcms.cms.entity.main.Content;
import com.cockroach.cockcms.cms.entity.main.ContentTxt;

public interface ContentTxtMng {
	public ContentTxt save(ContentTxt txt, Content content);

	public ContentTxt update(ContentTxt txt, Content content);
}