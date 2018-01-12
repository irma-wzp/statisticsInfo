package com.henghao.service;

import com.henghao.common.result.Result;

public interface IStatisticsService {
    Result getAllInfo();

    Result getCaseCount();

    Result getImportent();

    Result positionDeviation();
}
