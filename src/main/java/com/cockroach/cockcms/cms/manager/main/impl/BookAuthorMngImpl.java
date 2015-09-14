package com.cockroach.cockcms.cms.manager.main.impl;

import com.cockroach.cockcms.cms.dao.main.BookAuthorDao;
import com.cockroach.cockcms.cms.entity.main.BookAuthorEntity;
import com.cockroach.cockcms.cms.manager.main.BookAuthorMng;
import com.cockroach.cockcms.common.hibernate3.Updater;
import org.springframework.stereotype.Service;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:24
 */
@Service("bookInfoMng")
public class BookAuthorMngImpl implements BookAuthorMng {
    private BookAuthorDao dao;

    @Override
    public BookAuthorEntity save(BookAuthorEntity bean) {
        return dao.save(bean);
    }

    @Override
    public BookAuthorEntity update(BookAuthorEntity bean) {
        Updater<BookAuthorEntity> updater = new Updater<BookAuthorEntity>(bean);
        return dao.updateByUpdater(updater);
    }

    @Override
    public BookAuthorEntity deleteById(Integer id) {
        return dao.deleteById(id);
    }
}
