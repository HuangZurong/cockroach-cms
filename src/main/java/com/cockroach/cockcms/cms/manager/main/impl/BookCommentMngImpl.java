package com.cockroach.cockcms.cms.manager.main.impl;

import com.cockroach.cockcms.cms.dao.main.BookCommentDao;
import com.cockroach.cockcms.cms.entity.main.BookCommentEntity;
import com.cockroach.cockcms.cms.manager.main.BookCommentMng;
import com.cockroach.cockcms.common.hibernate3.Updater;
import org.springframework.stereotype.Service;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:24
 */
@Service("bookInfoMng")
public class BookCommentMngImpl implements BookCommentMng {
    private BookCommentDao dao;

    @Override
    public BookCommentEntity save(BookCommentEntity bean) {
        return dao.save(bean);
    }

    @Override
    public BookCommentEntity update(BookCommentEntity bean) {
        Updater<BookCommentEntity> updater = new Updater<BookCommentEntity>(bean);
        return dao.updateByUpdater(updater);
    }

    @Override
    public BookCommentEntity deleteById(Integer id) {
        return dao.deleteById(id);
    }
}
