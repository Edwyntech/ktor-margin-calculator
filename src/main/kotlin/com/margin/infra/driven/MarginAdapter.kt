package com.margin.infra.driven

import com.margin.domain.employee.Employee
import com.margin.domain.margin.MarginSpi

// DRIVEN
class MarginAdapter: MarginSpi {
    override fun getMargin(yearsOfExperience: Int): Int {
        TODO("Not yet implemented")
        // Mettre en base la marge par années d'expérience
    }

    override fun getExcessMargin(employee: Employee, margin: Int): Int {
        TODO("Not yet implemented")
        // Calcul TJM x NbJ - (SBA * 1,5 + marge)
    }
}
