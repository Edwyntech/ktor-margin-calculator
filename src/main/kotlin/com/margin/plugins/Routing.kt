package com.margin.plugins

import com.margin.domain.employee.Employee
import com.margin.infra.driving.MarginController
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val marginController: MarginController by inject()
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/margin") {
            val employee = call.receive<Employee>()
            val margin = marginController.getMarginFromYearsOfExperience(employee.yearsOfExperience)
            val excessMargin = marginController.getExcessMargin(employee, margin)
            call.respondText(excessMargin.toString())
        }
    }
}
