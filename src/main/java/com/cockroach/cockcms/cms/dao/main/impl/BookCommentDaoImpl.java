package com.cockroach.cockcms.cms.dao.main.impl;

import com.cockroach.cockcms.cms.dao.main.BookCommentDao;
import com.cockroach.cockcms.cms.entity.main.BookCommentEntity;
import com.cockroach.cockcms.common.hibernate3.HibernateBaseDao;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:14
 */
public class BookCommentDaoImpl extends HibernateBaseDao<BookCommentEntity, Integer> implements BookCommentDao {

    @Override
    public BookCommentEntity save(BookCommentEntity bean) {
        getSession().save(bean);
        return bean;
    }

    @Override
    public BookCommentEntity deleteById(Integer id) {
        BookCommentEntity entity = super.get(id);
        if (entity != null) {
            getSession().delete(entity);
        }
        return entity;

    }

    @Override
    protected Class<BookCommentEntity> getEntityClass() {
        return null;
    }
}
