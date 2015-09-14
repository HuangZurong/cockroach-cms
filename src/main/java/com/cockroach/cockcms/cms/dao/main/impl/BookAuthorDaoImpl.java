package com.cockroach.cockcms.cms.dao.main.impl;

import com.cockroach.cockcms.cms.dao.main.BookAuthorDao;
import com.cockroach.cockcms.cms.entity.main.BookAuthorEntity;
import com.cockroach.cockcms.common.hibernate3.HibernateBaseDao;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:14
 */
public class BookAuthorDaoImpl extends HibernateBaseDao<BookAuthorEntity, Integer> implements BookAuthorDao {

    @Override
    public BookAuthorEntity save(BookAuthorEntity bean) {
        getSession().save(bean);
        return bean;
    }

    @Override
    public BookAuthorEntity deleteById(Integer id) {
        BookAuthorEntity entity = super.get(id);
        if (entity != null) {
            getSession().delete(entity);
        }
        return entity;

    }

    @Override
    protected Class<BookAuthorEntity> getEntityClass() {
        return null;
    }
}
