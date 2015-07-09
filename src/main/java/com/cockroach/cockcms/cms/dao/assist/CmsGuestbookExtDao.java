package com.cockroach.cockcms.cms.dao.assist;

import com.cockroach.cockcms.cms.entity.assist.CmsGuestbookExt;
import com.cockroach.cockcms.common.hibernate3.Updater;

public interface CmsGuestbookExtDao {
	public CmsGuestbookExt findById(Integer id);

	public CmsGuestbookExt save(CmsGuestbookExt bean);

	public CmsGuestbookExt updateByUpdater(Updater<CmsGuestbookExt> updater);

	public CmsGuestbookExt deleteById(Integer id);
}