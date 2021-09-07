package org.adn.rewapp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_start.*
import org.adn.rewapp.Model.Employee
import org.adn.rewapp.Model.EmployeeCredentials
import org.adn.rewapp.service.ApiController
import retrofit2.Call
import retrofit2.Response

class StartActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        btn_login.setOnClickListener { v->

            validateCredentials()
           /* val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)*/
        }

    }


    fun validateCredentials(){
        var api = ApiController.retrofit

        val employee = EmployeeCredentials()

        employee.email = txt_login_email.text.toString()
        employee.password = txt_login_password.text.toString()

        val request = api.validateCredentials(employee)

        request.enqueue(
           object : retrofit2.Callback<Employee>{
               override fun onResponse(call: Call<Employee>, response: Response<Employee>) {
                   if(response.isSuccessful){
                       Toast.makeText(this@StartActivity, response.body()!!.name, Toast.LENGTH_SHORT).show()
                   }
               }

               override fun onFailure(call: Call<Employee>, t: Throwable) {
                   Log.d("ERROR", t.localizedMessage)
               }

           }
        )



    }


}