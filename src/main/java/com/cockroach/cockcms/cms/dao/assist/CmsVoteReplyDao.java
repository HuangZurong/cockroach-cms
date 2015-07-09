package com.cockroach.cockcms.cms.dao.assist;

import com.cockroach.cockcms.cms.entity.assist.CmsVoteReply;
import com.cockroach.cockcms.common.hibernate3.Updater;
import com.cockroach.cockcms.common.page.Pagination;

public interface CmsVoteReplyDao {

	public Pagination getPage(Integer subTopicId, int pageNo, int pageSize);
	
	public CmsVoteReply findById(Integer id);

	public CmsVoteReply save(CmsVoteReply bean);

	public CmsVoteReply updateByUpdater(Updater<CmsVoteReply> updater);

	public CmsVoteReply deleteById(Integer id);
}