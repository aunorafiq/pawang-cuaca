package com.example.maunorafiq.pawangcuaca.presentation.internal.di.component;

import android.content.Context;

import com.example.maunorafiq.pawangcuaca.presentation.internal.di.module.ApplicationModule;
import com.example.maunorafiq.pawangcuaca.presentation.view.activity.BaseActivity;
import com.icehousecorp.maunorafiq.domain.weathers.repository.WeathersRepository;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by maunorafiq on 11/29/16.
 */

@Singleton
@Component (modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject (BaseActivity baseActivity);

    Context context();
    WeathersRepository currentWeatherRepository();
}