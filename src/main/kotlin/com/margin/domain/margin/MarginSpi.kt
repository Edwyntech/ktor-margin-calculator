package com.margin.domain.margin

import com.margin.domain.employee.Employee

interface MarginSpi {
    fun getMargin(seniority: Int): Int

    fun getExcessMargin(employee: Employee, margin: Int): Int

    fun getMinimumNumberOfWorkingDaysForExcessMargin(employee: Employee, margin: Int): Int
}
