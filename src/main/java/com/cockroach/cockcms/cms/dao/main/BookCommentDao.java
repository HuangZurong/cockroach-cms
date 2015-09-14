package com.cockroach.cockcms.cms.dao.main;

import com.cockroach.cockcms.cms.entity.main.BookCommentEntity;
import com.cockroach.cockcms.common.hibernate3.Updater;

/**
 * @author Wave
 * @version v 0.1 2015/8/28 19:33
 */
public interface BookCommentDao {

    public BookCommentEntity save(BookCommentEntity bean);

    public BookCommentEntity updateByUpdater(Updater<BookCommentEntity> updater);

    public BookCommentEntity deleteById(Integer id);

}
