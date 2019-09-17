package _fun.qjl.kotlin.java.hybird.demo.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
@RequestMapping("api/random-number")
class RandomNumberController {
    @GetMapping
    fun generate(): ResponseEntity<Int> {
        return ResponseEntity.ok(Random.nextInt())
    }
}