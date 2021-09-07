package org.adn.rewapp.service

import org.adn.rewapp.Model.Employee
import org.adn.rewapp.Model.EmployeeCredentials
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RewappApi {

    @POST("loginEmployee")
    fun validateCredentials(@Body employee: EmployeeCredentials) : Call<Employee>

}