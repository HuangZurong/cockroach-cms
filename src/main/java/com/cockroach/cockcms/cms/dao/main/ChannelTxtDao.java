package com.cockroach.cockcms.cms.dao.main;

import com.cockroach.cockcms.cms.entity.main.ChannelTxt;
import com.cockroach.cockcms.common.hibernate3.Updater;

public interface ChannelTxtDao {
	public ChannelTxt findById(Integer id);

	public ChannelTxt save(ChannelTxt bean);

	public ChannelTxt updateByUpdater(Updater<ChannelTxt> updater);
}