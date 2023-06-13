package com.margin.plugins

import com.margin.domain.employee.Employee
import com.margin.infra.driving.MarginService
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val marginService : MarginService by inject()
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        post("/margin") {
            val employee = call.receive<Employee>()
            val margin = marginService.getMarginFromYearsOfExperience(employee.yearsOfExperience)
            val excessMargin = marginService.getExcessMargin(employee, margin)
            call.respondText(excessMargin.toString())
        }
    }
}
