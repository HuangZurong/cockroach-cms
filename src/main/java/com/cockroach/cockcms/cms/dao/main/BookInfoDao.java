package com.cockroach.cockcms.cms.dao.main;

import com.cockroach.cockcms.cms.entity.main.BookInfoEntity;
import com.cockroach.cockcms.common.hibernate3.Updater;

/**
 * @author Wave
 * @version v 0.1 2015/8/28 19:33
 */
public interface BookInfoDao {

    public BookInfoEntity save(BookInfoEntity bean);

    public BookInfoEntity updateByUpdater(Updater<BookInfoEntity> updater);

    public BookInfoEntity deleteById(Integer id);

}
