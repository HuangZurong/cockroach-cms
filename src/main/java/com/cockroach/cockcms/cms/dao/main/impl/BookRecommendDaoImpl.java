package com.cockroach.cockcms.cms.dao.main.impl;

import com.cockroach.cockcms.cms.dao.main.BookRecommendDao;
import com.cockroach.cockcms.cms.entity.main.BookRecommendEntity;
import com.cockroach.cockcms.common.hibernate3.HibernateBaseDao;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:14
 */
public class BookRecommendDaoImpl extends HibernateBaseDao<BookRecommendEntity, Integer> implements BookRecommendDao {

    @Override
    public BookRecommendEntity save(BookRecommendEntity bean) {
        getSession().save(bean);
        return bean;
    }


    @Override
    public BookRecommendEntity deleteById(Integer id) {
        BookRecommendEntity entity = super.get(id);
        if (entity != null) {
            getSession().delete(entity);
        }
        return entity;

    }

    @Override
    protected Class<BookRecommendEntity> getEntityClass() {
        return null;
    }
}
