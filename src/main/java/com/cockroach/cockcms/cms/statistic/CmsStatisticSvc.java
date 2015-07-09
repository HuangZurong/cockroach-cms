package com.cockroach.cockcms.cms.statistic;

import java.util.List;
import java.util.Map;

import com.cockroach.cockcms.cms.statistic.CmsStatistic.CmsStatisticModel;

public interface CmsStatisticSvc {
	public List<CmsStatistic> statisticByModel(int type,
											   CmsStatisticModel statisticModel, Integer year, Integer month,
											   Integer day, Map<String, Object> restrictions);
}
