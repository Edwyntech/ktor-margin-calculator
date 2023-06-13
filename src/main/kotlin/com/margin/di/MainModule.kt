package com.margin.di

import com.margin.domain.margin.MarginHandlerApi
import com.margin.infra.driven.MarginAdapter
import com.margin.infra.driving.MarginService
import org.koin.dsl.bind
import org.koin.dsl.module

val mainModule = module(createdAtStart = true) {
    single { MarginHandlerApi::class }
    single { MarginService() }
    single { MarginAdapter() }
}