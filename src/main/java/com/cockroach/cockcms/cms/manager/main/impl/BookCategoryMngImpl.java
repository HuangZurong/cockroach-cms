package com.cockroach.cockcms.cms.manager.main.impl;

import com.cockroach.cockcms.cms.dao.main.BookCategoryDao;
import com.cockroach.cockcms.cms.entity.main.BookCategoryEntity;
import com.cockroach.cockcms.cms.manager.main.BookCategoryMng;
import com.cockroach.cockcms.common.hibernate3.Updater;
import org.springframework.stereotype.Service;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:24
 */
@Service("bookInfoMng")
public class BookCategoryMngImpl implements BookCategoryMng {
    private BookCategoryDao dao;

    @Override
    public BookCategoryEntity save(BookCategoryEntity bean) {
        return dao.save(bean);
    }

    @Override
    public BookCategoryEntity update(BookCategoryEntity bean) {
        Updater<BookCategoryEntity> updater = new Updater<BookCategoryEntity>(bean);
        return dao.updateByUpdater(updater);
    }

    @Override
    public BookCategoryEntity deleteById(Integer id) {
        return dao.deleteById(id);
    }
}
