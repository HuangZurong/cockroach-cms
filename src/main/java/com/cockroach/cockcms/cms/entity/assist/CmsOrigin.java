package com.cockroach.cockcms.cms.entity.assist;

import com.cockroach.cockcms.cms.entity.assist.base.BaseCmsOrigin;



public class CmsOrigin extends BaseCmsOrigin {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsOrigin () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsOrigin (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsOrigin (
		Integer id,
		String name,
		Integer refCount,
		String nameInitial) {

		super (
			id,
			name,
			refCount,
			nameInitial);
	}

/*[CONSTRUCTOR MARKER END]*/


}