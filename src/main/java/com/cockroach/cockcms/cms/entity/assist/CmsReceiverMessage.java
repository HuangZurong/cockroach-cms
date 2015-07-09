package com.cockroach.cockcms.cms.entity.assist;

import com.cockroach.cockcms.cms.entity.assist.base.BaseCmsReceiverMessage;
import com.cockroach.cockcms.common.util.StrUtils;

public class CmsReceiverMessage extends BaseCmsReceiverMessage {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsReceiverMessage() {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsReceiverMessage(Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsReceiverMessage(Integer id,
			com.cockroach.cockcms.core.entity.CmsUser msgReceiverUser,
			com.cockroach.cockcms.core.entity.CmsUser msgSendUser,
			com.cockroach.cockcms.core.entity.CmsSite site, String msgTitle,
			String msgContent, java.util.Date sendTime,
			boolean msgStatus, Integer msgBox) {

		super(id, msgReceiverUser, msgSendUser, site, msgTitle, msgContent,
				sendTime, msgStatus, msgBox);
	}

	public CmsReceiverMessage(CmsMessage message) {
		super(message.getId(), message.getMsgReceiverUser(), message
				.getMsgSendUser(), message.getSite(), message.getMsgTitle(),
				message.getMsgContent(), message.getSendTime(), message
						.getMsgStatus(), message.getMsgBox());
	}
	public String getTitleHtml() {
		return StrUtils.txt2htm(getMsgTitle());
	}
	public String getContentHtml() {
		return StrUtils.txt2htm(getMsgContent());
	}

	/* [CONSTRUCTOR MARKER END] */

}