package com.cockroach.cockcms.cms.dao.main;

import com.cockroach.cockcms.cms.entity.main.ChannelExt;
import com.cockroach.cockcms.common.hibernate3.Updater;

public interface ChannelExtDao {
	public ChannelExt save(ChannelExt bean);

	public ChannelExt updateByUpdater(Updater<ChannelExt> updater);
}