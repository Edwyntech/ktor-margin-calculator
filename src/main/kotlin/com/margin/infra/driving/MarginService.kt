package com.margin.infra.driving

import com.margin.domain.employee.Employee
import com.margin.domain.margin.MarginHandlerApi
import com.margin.infra.driven.MarginAdapter
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class MarginService: KoinComponent, MarginHandlerApi {
    private val marginAdapter: MarginAdapter by inject()

    override fun getMarginFromSeniority(years: Int): Int {
        return marginAdapter.getMargin(years)
    }

    override fun getExcessMargin(employee: Employee, margin: Int): Int {
        return marginAdapter.getExcessMargin(employee, margin)
    }

    override fun getMinimumNumberOfWorkingDays(employee: Employee, margin: Int): Int {
        return marginAdapter.getMinimumNumberOfWorkingDaysForExcessMargin(employee, margin)
    }


}
