package com.cockroach.cockcms.cms.manager.main;

import com.cockroach.cockcms.cms.entity.main.Channel;
import com.cockroach.cockcms.cms.entity.main.ChannelExt;

public interface ChannelExtMng {
	public ChannelExt save(ChannelExt ext, Channel channel);

	public ChannelExt update(ChannelExt ext);
}