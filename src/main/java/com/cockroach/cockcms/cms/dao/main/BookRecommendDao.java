package com.cockroach.cockcms.cms.dao.main;

import com.cockroach.cockcms.cms.entity.main.BookRecommendEntity;
import com.cockroach.cockcms.common.hibernate3.Updater;

/**
 * @author Wave
 * @version v 0.1 2015/8/28 19:33
 */
public interface BookRecommendDao {

    public BookRecommendEntity save(BookRecommendEntity bean);

    public BookRecommendEntity updateByUpdater(Updater<BookRecommendEntity> updater);

    public BookRecommendEntity deleteById(Integer id);

}
