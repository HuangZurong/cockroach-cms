package com.cockroach.cockcms.core.manager;

import java.util.Date;

import com.cockroach.cockcms.core.entity.CmsConfig;
import com.cockroach.cockcms.core.entity.CmsConfigAttr;
import com.cockroach.cockcms.core.entity.MarkConfig;
import com.cockroach.cockcms.core.entity.MemberConfig;

public interface CmsConfigMng {
	public CmsConfig get();

	public void updateCountCopyTime(Date d);

	public void updateCountClearTime(Date d);

	public CmsConfig update(CmsConfig bean);

	public MarkConfig updateMarkConfig(MarkConfig mark);

	public void updateMemberConfig(MemberConfig memberConfig);
	
	public void updateConfigAttr(CmsConfigAttr configAttr);
}