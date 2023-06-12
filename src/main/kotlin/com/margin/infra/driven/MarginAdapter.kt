package com.margin.infra.driven

import com.margin.domain.employee.Employee
import com.margin.domain.margin.MarginSpi

// DRIVEN
class MarginAdapter: MarginSpi {
    override fun getMargin(yearsOfExperience: Int): Int {
        TODO("Not yet implemented")
    }

    override fun getExcessMargin(employee: Employee): Int {
        TODO("Not yet implemented")
        // Calcul TJM x NbJ - (SBA * 1,5 + marge)
    }
}
