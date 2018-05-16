package springkotlin

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders

@ExtendWith(SpringExtension::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FeaturesControllerTests {
    private lateinit var mockMvc: MockMvc

    @BeforeEach
    fun setup() {
        val controller = FeaturesController()
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build()
    }

    @Test
    fun `returns all Kotlin features`() {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk)
                .andExpect(content().string("Java interoperability, data classes, default parameters, null safety"))
    }
}   