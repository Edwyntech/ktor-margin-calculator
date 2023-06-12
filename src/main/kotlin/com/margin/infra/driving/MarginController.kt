package com.margin.infra.driving

import com.margin.domain.employee.Employee
import com.margin.infra.driven.MarginAdapter
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class MarginController: KoinComponent {
    private val marginAdapter: MarginAdapter by inject()

    fun getMarginFromYearsOfExperience(years: Int): Int {
        return marginAdapter.getMargin(years)
    }

    fun getExcessMargin(employee: Employee, margin: Int): Int {
        return marginAdapter.getExcessMargin(employee, margin)
    }
}
