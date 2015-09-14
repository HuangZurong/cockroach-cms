package com.cockroach.cockcms.cms.manager.main;

import com.cockroach.cockcms.cms.entity.main.BookInfoEntity;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:21
 */
public interface BookInfoMng {

    public BookInfoEntity save(BookInfoEntity bean);

    public BookInfoEntity update(BookInfoEntity bean);

    public BookInfoEntity deleteById(Integer id);

}
