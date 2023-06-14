package com.margin.infra.driven

import com.margin.domain.employee.Employee
import org.junit.jupiter.api.Assertions.*
import org.junit.Test

class MarginAdapterTest {
private val marginAdapter = MarginAdapter()

    @Test
    fun shouldReturn30000For1yearOfSeniority(){
        val seniority = 1
        val expected = 30000
        val actual = marginAdapter.getMargin(seniority)
        assertEquals(expected, actual)
    }

    @Test
    fun shouldReturn30000For0yearOfSeniority(){
        val seniority = 0
        val expected = 30000
        val actual = marginAdapter.getMargin(seniority)
        assertEquals(expected, actual)
    }

    @Test
    fun shouldReturn27000For5yearsOfSeniority(){
        val seniority = 5
        val expected = 27000
        val actual = marginAdapter.getMargin(seniority)
        assertEquals(expected, actual)
    }

    @Test
    fun shouldReturnExcessMargin(){
        val employee = Employee(
            annualGrossSalary = 54000,
            averageDailyRate = 600,
            numberOfWorkingDays = 215,
            seniority = 1
        )
        val margin = marginAdapter.getMargin(employee.seniority)
        val expected = 18000
        val actual = marginAdapter.getExcessMargin(employee, margin)
        assertEquals(expected, actual)

    }

    @Test
    fun shouldReturnNegativeMargin(){
        val employee = Employee(
            annualGrossSalary = 54000,
            averageDailyRate = 600,
            numberOfWorkingDays = 180,
            seniority = 1
        )
        val margin = marginAdapter.getMargin(employee.seniority)
        val expected = -3000
        val actual = marginAdapter.getExcessMargin(employee, margin)
        assertEquals(expected, actual)
    }
}
