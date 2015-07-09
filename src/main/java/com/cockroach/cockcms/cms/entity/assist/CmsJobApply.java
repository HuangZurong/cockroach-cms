package com.cockroach.cockcms.cms.entity.assist;

import com.cockroach.cockcms.cms.entity.assist.base.BaseCmsJobApply;



public class CmsJobApply extends BaseCmsJobApply {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsJobApply () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsJobApply (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsJobApply (
		Integer id,
		com.cockroach.cockcms.cms.entity.main.Content content,
		com.cockroach.cockcms.core.entity.CmsUser user,
		java.util.Date applyTime) {

		super (
			id,
			content,
			user,
			applyTime);
	}

/*[CONSTRUCTOR MARKER END]*/


}