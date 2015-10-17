package com.cockroach.cockcms.cms.entity.main;

import com.cockroach.cockcms.cms.entity.main.base.BaseCmsModel;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static com.cockroach.cockcms.cms.Constants.*;
import static com.cockroach.cockcms.common.web.Constants.DEFAULT;

public class CmsModel extends BaseCmsModel {
	private static final long serialVersionUID = 1L;

	public String getTplChannel(String solution, boolean def) {
		StringBuilder t = new StringBuilder();
		t.append(solution).append("/");
		if (getHasContent()) {
			t.append(TPLDIR_CHANNEL);
		} else {
			t.append(TPLDIR_ALONE);
		}
		t.append("/");
		String prefix = getTplChannelPrefix();
		if (def) {
			if (!StringUtils.isBlank(prefix)) {
				t.append(prefix);
			} else {
				t.append(DEFAULT);
			}
			t.append(TPL_SUFFIX);
		} else {
			if (!StringUtils.isBlank(prefix)) {
				t.append(prefix);
			}
		}
		return t.toString();
	}

	public String getTplContent(String solution, boolean def) {
		StringBuilder t = new StringBuilder();
		t.append(solution).append("/");
		t.append(TPLDIR_CONTENT);
		t.append("/");
		String prefix = getTplContentPrefix();
		if (def) {
			if (!StringUtils.isBlank(prefix)) {
				t.append(prefix);
			} else {
				t.append(DEFAULT);
			}
			t.append(TPL_SUFFIX);
		} else {
			if (!StringUtils.isBlank(prefix)) {
				t.append(prefix);
			}
		}
		return t.toString();

	}
	
	public List<String> getModelItems(){
		Set<CmsModelItem>items=getItems();
		List<String>fileList=new ArrayList<String>();
		Iterator<CmsModelItem>it=items.iterator();
		while(it.hasNext()){
			fileList.add(it.next().getField());
		}
		return fileList;
	}

	public void init() {
		if (getDisabled() == null) {
			setDisabled(false);
		}
		if (getDef() == null) {
			setDef(false);
		}
	}

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsModel() {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsModel(Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsModel(Integer id, String name,
			String path, Integer titleImgWidth,
			Integer titleImgHeight,
			Integer contentImgWidth,
			Integer contentImgHeight, Integer priority,
			Boolean hasContent, Boolean disabled,
			Boolean def, String submitUrl) {

		super(id, name, path, titleImgWidth, titleImgHeight, contentImgWidth,
				contentImgHeight, priority, hasContent, disabled, def, submitUrl);
	}

	/* [CONSTRUCTOR MARKER END] */

}