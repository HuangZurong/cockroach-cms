package com.cockroach.cockcms.cms.manager.assist;

import com.cockroach.cockcms.cms.entity.assist.CmsGuestbook;
import com.cockroach.cockcms.cms.entity.assist.CmsGuestbookExt;

public interface CmsGuestbookExtMng {
	public CmsGuestbookExt save(CmsGuestbookExt ext, CmsGuestbook guestbook);

	public CmsGuestbookExt update(CmsGuestbookExt ext);
}