package com.cockroach.cockcms.cms.dao.main.impl;

import com.cockroach.cockcms.cms.dao.main.BookCategoryDao;
import com.cockroach.cockcms.cms.entity.main.BookCategoryEntity;
import com.cockroach.cockcms.common.hibernate3.HibernateBaseDao;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:14
 */
public class BookCategoryDaoImpl extends HibernateBaseDao<BookCategoryEntity, Integer> implements BookCategoryDao {

    @Override
    public BookCategoryEntity save(BookCategoryEntity bean) {
        getSession().save(bean);
        return bean;
    }

    @Override
    public BookCategoryEntity deleteById(Integer id) {
        BookCategoryEntity entity = super.get(id);
        if (entity != null) {
            getSession().delete(entity);
        }
        return entity;

    }

    @Override
    protected Class<BookCategoryEntity> getEntityClass() {
        return null;
    }
}
