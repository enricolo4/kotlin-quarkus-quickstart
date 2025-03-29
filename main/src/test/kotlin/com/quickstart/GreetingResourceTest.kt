package com.quickstart

import com.quickstart.user.dto.request.UserToCreateInputDTO
import io.quarkus.test.junit.QuarkusTest
import io.restassured.module.kotlin.extensions.Extract
import io.restassured.module.kotlin.extensions.Given
import io.restassured.module.kotlin.extensions.Then
import io.restassured.module.kotlin.extensions.When
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

@QuarkusTest
class GreetingResourceTest {

    @Test
    fun testHelloEndpoint() {
        Given {
            body(UserToCreateInputDTO(name = "Enrico", email = "enrico@gmail.com", cpf = "343495668-99"))
            contentType("application/json")
        } When {
            post("/users")
        } Then {
            statusCode(200)
            body("name", equalTo("Enrico"))
        } Extract { path<String>("name") }
    }
}