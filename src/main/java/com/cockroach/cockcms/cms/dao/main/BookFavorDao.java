package com.cockroach.cockcms.cms.dao.main;

import com.cockroach.cockcms.cms.entity.main.BookFavorEntity;
import com.cockroach.cockcms.common.hibernate3.Updater;

/**
 * @author Wave
 * @version v 0.1 2015/8/28 19:33
 */
public interface BookFavorDao {

    public BookFavorEntity save(BookFavorEntity bean);

    public BookFavorEntity updateByUpdater(Updater<BookFavorEntity> updater);

    public BookFavorEntity deleteById(Integer id);

}
