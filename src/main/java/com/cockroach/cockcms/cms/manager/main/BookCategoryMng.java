package com.cockroach.cockcms.cms.manager.main;

import com.cockroach.cockcms.cms.entity.main.BookCategoryEntity;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:21
 */
public interface BookCategoryMng {

    public BookCategoryEntity save(BookCategoryEntity bean);

    public BookCategoryEntity update(BookCategoryEntity bean);

    public BookCategoryEntity deleteById(Integer id);

}
