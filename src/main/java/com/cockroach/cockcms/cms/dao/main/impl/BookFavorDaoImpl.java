package com.cockroach.cockcms.cms.dao.main.impl;

import com.cockroach.cockcms.cms.dao.main.BookFavorDao;
import com.cockroach.cockcms.cms.entity.main.BookFavorEntity;
import com.cockroach.cockcms.common.hibernate3.HibernateBaseDao;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:14
 */
public class BookFavorDaoImpl extends HibernateBaseDao<BookFavorEntity, Integer> implements BookFavorDao {

    @Override
    public BookFavorEntity save(BookFavorEntity bean) {
        getSession().save(bean);
        return bean;
    }

    @Override
    public BookFavorEntity deleteById(Integer id) {
        BookFavorEntity entity = super.get(id);
        if (entity != null) {
            getSession().delete(entity);
        }
        return entity;

    }

    @Override
    protected Class<BookFavorEntity> getEntityClass() {
        return null;
    }
}
