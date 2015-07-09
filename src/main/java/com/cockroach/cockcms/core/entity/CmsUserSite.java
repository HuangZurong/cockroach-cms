package com.cockroach.cockcms.core.entity;

import com.cockroach.cockcms.core.entity.base.BaseCmsUserSite;

public class CmsUserSite extends BaseCmsUserSite {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsUserSite () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsUserSite (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsUserSite (
		Integer id,
		com.cockroach.cockcms.core.entity.CmsUser user,
		com.cockroach.cockcms.core.entity.CmsSite site,
		Byte checkStep,
		Boolean allChannel) {

		super (
			id,
			user,
			site,
			checkStep,
			allChannel);
	}

	/* [CONSTRUCTOR MARKER END] */

}