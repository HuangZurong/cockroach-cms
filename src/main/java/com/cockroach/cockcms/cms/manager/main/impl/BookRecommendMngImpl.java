package com.cockroach.cockcms.cms.manager.main.impl;

import com.cockroach.cockcms.cms.dao.main.BookRecommendDao;
import com.cockroach.cockcms.cms.entity.main.BookRecommendEntity;
import com.cockroach.cockcms.cms.manager.main.BookRecommendMng;
import com.cockroach.cockcms.common.hibernate3.Updater;
import org.springframework.stereotype.Service;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:24
 */
@Service("bookInfoMng")
public class BookRecommendMngImpl implements BookRecommendMng {
    private BookRecommendDao dao;

    @Override
    public BookRecommendEntity save(BookRecommendEntity bean) {
        return dao.save(bean);
    }

    @Override
    public BookRecommendEntity update(BookRecommendEntity bean) {
        Updater<BookRecommendEntity> updater = new Updater<BookRecommendEntity>(bean);
        return dao.updateByUpdater(updater);
    }

    @Override
    public BookRecommendEntity deleteById(Integer id) {
        return dao.deleteById(id);
    }
}
