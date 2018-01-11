package com.henghao.service;

import com.henghao.domain.entity.result.Result;

public interface IStatisticsService {
    Result getAllInfo();

    Result getCaseCount();

    Result getImportent();

    Result positionDeviation();
}
