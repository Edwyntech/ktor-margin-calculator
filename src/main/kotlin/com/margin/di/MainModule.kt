package com.margin.di

import com.margin.infra.driven.MarginAdapter
import org.koin.dsl.module

val mainModule = module(createdAtStart = true) {
    single { MarginAdapter() }
}