package com.mzr.liqubase3881reproduce

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(classes = [Application::class])
class ApplicationTest {

    @Test
    fun testAdminGetExistingUserByEmail() {
        Assert.assertTrue(true)
    }

}