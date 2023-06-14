package com.margin.domain.employee

import kotlinx.serialization.Serializable

@Serializable
data class Employee(
    val annualGrossSalary: Int,
    val averageDailyRate: Int,
    val numberOfWorkingDays: Int,
    val seniority: Int
)
