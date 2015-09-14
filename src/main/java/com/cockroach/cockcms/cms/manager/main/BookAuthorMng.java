package com.cockroach.cockcms.cms.manager.main;

import com.cockroach.cockcms.cms.entity.main.BookAuthorEntity;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:21
 */
public interface BookAuthorMng {

    public BookAuthorEntity save(BookAuthorEntity bean);

    public BookAuthorEntity update(BookAuthorEntity bean);

    public BookAuthorEntity deleteById(Integer id);

}
