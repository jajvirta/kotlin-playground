package fi.jajvirta.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}

data class Quote(val person: String, val text: String)

@RestController
@RequestMapping("/api/quotes")
class QC {
    val quotes = mutableSetOf(Quote("Jamppa", "yoo!"))

    @RequestMapping
    fun allQuotes() = quotes

    @RequestMapping("/foo")
    fun foo() = "xxx"
}