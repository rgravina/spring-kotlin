package springkotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FeaturesController(val featuresRepository: FeaturesRepository) {
    @GetMapping
    fun hello() = "Java interoperability, data classes, default parameters, null safety"
}