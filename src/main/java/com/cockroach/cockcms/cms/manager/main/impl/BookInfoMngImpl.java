package com.cockroach.cockcms.cms.manager.main.impl;

import com.cockroach.cockcms.cms.dao.main.BookInfoDao;
import com.cockroach.cockcms.cms.entity.main.BookInfoEntity;
import com.cockroach.cockcms.cms.manager.main.BookInfoMng;
import com.cockroach.cockcms.common.hibernate3.Updater;
import org.springframework.stereotype.Service;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:24
 */
@Service("bookInfoMng")
public class BookInfoMngImpl implements BookInfoMng {
    private BookInfoDao dao;

    @Override
    public BookInfoEntity save(BookInfoEntity bean) {
        return dao.save(bean);
    }

    @Override
    public BookInfoEntity update(BookInfoEntity bean) {
        Updater<BookInfoEntity> updater = new Updater<BookInfoEntity>(bean);
        return dao.updateByUpdater(updater);
    }

    @Override
    public BookInfoEntity deleteById(Integer id) {
        return dao.deleteById(id);
    }
}
