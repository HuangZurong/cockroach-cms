package com.cockroach.cockcms.core.dao;

import com.cockroach.cockcms.common.hibernate3.Updater;
import com.cockroach.cockcms.core.entity.DbFile;

public interface DbFileDao {
	public DbFile findById(String id);

	public DbFile save(DbFile bean);

	public DbFile updateByUpdater(Updater<DbFile> updater);

	public DbFile deleteById(String id);
}