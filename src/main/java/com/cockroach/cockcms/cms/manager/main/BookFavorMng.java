package com.cockroach.cockcms.cms.manager.main;

import com.cockroach.cockcms.cms.entity.main.BookFavorEntity;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:21
 */
public interface BookFavorMng {

    public BookFavorEntity save(BookFavorEntity bean);

    public BookFavorEntity update(BookFavorEntity bean);

    public BookFavorEntity deleteById(Integer id);

}
