package com.cockroach.cockcms.cms.entity.assist;

import com.cockroach.cockcms.cms.entity.assist.base.BaseCmsSearchWords;



public class CmsSearchWords extends BaseCmsSearchWords {
	private static final long serialVersionUID = 1L;
	/**
	 * 搜索次数降序
	 */
	public static final int HIT_DESC=1;
	/**
	 * 优先级降序
	 */
	public static final int PRIORITY_DESC=2;
	/**
	 * 搜索次数升序
	 */
	public static final int HIT_ASC=3;
	/**
	 * 优先级升序
	 */
	public static final int PRIORITY_ASC=4;
	
	public static final int DEFAULT_PRIORITY=10;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsSearchWords () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsSearchWords (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsSearchWords (
		Integer id,
		String name,
		Integer hitCount,
		Integer priority,
		String nameInitial) {

		super (
			id,
			name,
			hitCount,
			priority,
			nameInitial);
	}

/*[CONSTRUCTOR MARKER END]*/


}