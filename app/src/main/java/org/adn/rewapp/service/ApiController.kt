package org.adn.rewapp.service

import android.os.Build
import androidx.annotation.RequiresApi
import retrofit2.converter.gson.GsonConverterFactory

import retrofit2.Retrofit
import com.google.gson.JsonParseException

import com.google.gson.JsonDeserializationContext

import com.google.gson.JsonElement

import com.google.gson.JsonDeserializer

import com.google.gson.GsonBuilder

import com.google.gson.Gson
import java.text.DateFormat
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime.ofInstant
import java.time.OffsetDateTime.ofInstant
import java.time.OffsetTime.ofInstant
import java.time.ZoneId
import java.time.ZonedDateTime.ofInstant
import java.time.format.DateTimeFormatter


@RequiresApi(Build.VERSION_CODES.O)
object ApiController {

    val BASE_URL = "http://192.168.1.101:9001/admin/users/";
    var retrofit : RewappApi



    @RequiresApi(Build.VERSION_CODES.O)
    private val gson = GsonBuilder().registerTypeAdapter(
        LocalDate::class.java,
            JsonDeserializer { json, type, jsonDeserializationContext -> LocalDate.parse(json.asJsonPrimitive.asString, DateTimeFormatter.ofPattern("dd-MM-yyyy")) })
        .create()


    init {
        retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(
                GsonConverterFactory.create(gson)
            )
            .build()
            .create(RewappApi::class.java)
    }




}