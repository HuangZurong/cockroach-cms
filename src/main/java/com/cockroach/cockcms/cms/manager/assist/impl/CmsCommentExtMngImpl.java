package com.cockroach.cockcms.cms.manager.assist.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cockroach.cockcms.cms.dao.assist.CmsCommentExtDao;
import com.cockroach.cockcms.cms.entity.assist.CmsComment;
import com.cockroach.cockcms.cms.entity.assist.CmsCommentExt;
import com.cockroach.cockcms.cms.manager.assist.CmsCommentExtMng;
import com.cockroach.cockcms.common.hibernate3.Updater;

@Service
@Transactional
public class CmsCommentExtMngImpl implements CmsCommentExtMng {
	public CmsCommentExt save(String ip, String text, CmsComment comment) {
		CmsCommentExt ext = new CmsCommentExt();
		ext.setText(text);
		ext.setIp(ip);
		ext.setComment(comment);
		comment.setCommentExt(ext);
		dao.save(ext);
		return ext;
	}

	public CmsCommentExt update(CmsCommentExt bean) {
		Updater<CmsCommentExt> updater = new Updater<CmsCommentExt>(bean);
		bean = dao.updateByUpdater(updater);
		return bean;
	}

	public int deleteByContentId(Integer contentId) {
		return dao.deleteByContentId(contentId);
	}

	private CmsCommentExtDao dao;

	@Autowired
	public void setDao(CmsCommentExtDao dao) {
		this.dao = dao;
	}
}