package com.cockroach.cockcms.cms.dao.main.impl;

import com.cockroach.cockcms.cms.dao.main.BookInfoDao;
import com.cockroach.cockcms.cms.entity.main.BookInfoEntity;
import com.cockroach.cockcms.common.hibernate3.HibernateBaseDao;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:14
 */
public class BookInfoDaoImpl extends HibernateBaseDao<BookInfoEntity, Integer> implements BookInfoDao {

    @Override
    public BookInfoEntity save(BookInfoEntity bean) {
        getSession().save(bean);
        return bean;
    }

    @Override
    public BookInfoEntity deleteById(Integer id) {
        BookInfoEntity entity = super.get(id);
        if (entity != null) {
            getSession().delete(entity);
        }
        return entity;
    }

    @Override
    protected Class<BookInfoEntity> getEntityClass() {
        return BookInfoEntity.class;
    }
}
