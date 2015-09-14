package com.cockroach.cockcms.cms.dao.main;

import com.cockroach.cockcms.cms.entity.main.BookAuthorEntity;
import com.cockroach.cockcms.common.hibernate3.Updater;

/**
 * @author Wave
 * @version v 0.1 2015/8/28 19:33
 */
public interface BookAuthorDao {

    public BookAuthorEntity save(BookAuthorEntity bean);

    public BookAuthorEntity updateByUpdater(Updater<BookAuthorEntity> updater);

    public BookAuthorEntity deleteById(Integer id);

}
