package com.margin.infra.driven

import com.margin.domain.employee.Employee
import com.margin.domain.margin.MarginSpi

// DRIVEN
class MarginAdapter: MarginSpi {
    override fun getMargin(seniority: Int): Int {
        return when {
            seniority == 1 -> 30000
            seniority == 2 -> 29000
            seniority == 3 -> 28000
            seniority >=4 -> 27000
            else -> 30000
        }
    }

    override fun getExcessMargin(employee: Employee, margin: Int): Int {
        return employee.averageDailyRate * employee.numberOfWorkingDays - (employee.annualGrossSalary * 1.5 + margin).toInt()
    }
}
