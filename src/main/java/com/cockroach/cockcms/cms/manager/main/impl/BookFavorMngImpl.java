package com.cockroach.cockcms.cms.manager.main.impl;

import com.cockroach.cockcms.cms.dao.main.BookFavorDao;
import com.cockroach.cockcms.cms.entity.main.BookFavorEntity;
import com.cockroach.cockcms.cms.manager.main.BookFavorMng;
import com.cockroach.cockcms.common.hibernate3.Updater;
import org.springframework.stereotype.Service;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:24
 */
@Service("bookInfoMng")
public class BookFavorMngImpl implements BookFavorMng {
    private BookFavorDao dao;

    @Override
    public BookFavorEntity save(BookFavorEntity bean) {
        return dao.save(bean);
    }

    @Override
    public BookFavorEntity update(BookFavorEntity bean) {
        Updater<BookFavorEntity> updater = new Updater<BookFavorEntity>(bean);
        return dao.updateByUpdater(updater);
    }

    @Override
    public BookFavorEntity deleteById(Integer id) {
        return dao.deleteById(id);
    }
}
