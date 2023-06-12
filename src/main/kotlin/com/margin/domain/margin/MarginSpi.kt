package com.margin.domain.margin

import com.margin.domain.employee.Employee

interface MarginSpi {
    fun getMargin(yearsOfExperience: Int): Int

    fun getExcessMargin(employee: Employee): Int
}
