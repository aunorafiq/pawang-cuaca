package com.icehousecorp.maunorafiq.data.forecast.repository.datasource;

import com.icehousecorp.maunorafiq.data.forecast.entity.response.ForecastResponse;

import rx.Observable;

/**
 * Created by maunorafiq on 11/29/16.
 */

public interface ForecastDataStore {

    Observable<ForecastResponse> getForecastEntity(final String city);
}
