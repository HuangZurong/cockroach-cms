package com.cockroach.cockcms.cms.entity.main;

import com.cockroach.cockcms.cms.entity.main.base.BaseContentPicture;



public class ContentPicture extends BaseContentPicture {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public ContentPicture () {
		super();
	}

	/**
	 * Constructor for required fields
	 */
	public ContentPicture (
		String imgPath) {

		super (
			imgPath);
	}

/*[CONSTRUCTOR MARKER END]*/


}