package com.cockroach.cockcms.cms.manager.main;

import com.cockroach.cockcms.cms.entity.main.BookCommentEntity;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:21
 */
public interface BookCommentMng {

    public BookCommentEntity save(BookCommentEntity bean);

    public BookCommentEntity update(BookCommentEntity bean);

    public BookCommentEntity deleteById(Integer id);

}
