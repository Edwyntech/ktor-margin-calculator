package com.margin.domain.margin

import com.margin.domain.employee.Employee

interface MarginHandlerApi {
    fun getMarginFromSeniority(years: Int): Int

    fun getExcessMargin(employee: Employee, margin: Int): Int
}
