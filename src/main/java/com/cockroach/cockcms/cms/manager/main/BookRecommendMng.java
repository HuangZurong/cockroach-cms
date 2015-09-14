package com.cockroach.cockcms.cms.manager.main;

import com.cockroach.cockcms.cms.entity.main.BookRecommendEntity;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:21
 */
public interface BookRecommendMng {

    public BookRecommendEntity save(BookRecommendEntity bean);

    public BookRecommendEntity update(BookRecommendEntity bean);

    public BookRecommendEntity deleteById(Integer id);

}
