package com.cockroach.cockcms.cms.dao.main;

import com.cockroach.cockcms.cms.entity.main.BookCategoryEntity;
import com.cockroach.cockcms.common.hibernate3.Updater;

/**
 * @author Wave
 * @version v 0.1 2015/8/28 19:33
 */
public interface BookCategoryDao {

    public BookCategoryEntity save(BookCategoryEntity bean);

    public BookCategoryEntity updateByUpdater(Updater<BookCategoryEntity> updater);

    public BookCategoryEntity deleteById(Integer id);

}
