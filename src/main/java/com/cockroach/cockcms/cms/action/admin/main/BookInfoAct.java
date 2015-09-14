package com.cockroach.cockcms.cms.action.admin.main;

import com.cockroach.cockcms.cms.entity.main.BookInfoEntity;
import com.cockroach.cockcms.cms.manager.main.BookInfoMng;
import com.cockroach.cockcms.core.manager.CmsLogMng;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Wave
 * @version v 0.1 2015/8/29 16:30
 */
public class BookInfoAct {
    private static final Logger LOGGER = LoggerFactory.getLogger(BookInfoAct.class);

    @Autowired
    private BookInfoMng bookInfoMng;

    @Autowired
    private CmsLogMng cmsLogMng;

    @RequiresPermissions("book:book_main")
    @RequestMapping("/book/book_main.do")
    public String bookMain(ModelMap model) {
        return "book/book_main";
    }

    @RequiresPermissions("channel:v_add")
    @RequestMapping("/channel/v_add.do")
    public String save(BookInfoEntity bean, HttpServletRequest request, ModelMap modelMap) {
        bean = bookInfoMng.save(bean);
        LOGGER.info("save Book id={}", bean.getId());
        cmsLogMng.operating(request, "book.log.save", "id=" + bean.getId()
                + ";bookName=" + bean.getMainName());
        return "success";
    }

}
