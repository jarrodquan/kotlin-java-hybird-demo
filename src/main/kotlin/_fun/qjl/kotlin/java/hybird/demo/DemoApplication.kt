package _fun.qjl.kotlin.java.hybird.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(
        exclude = [
            DataSourceAutoConfiguration::class,
            JpaRepositoriesAutoConfiguration::class
        ]
)
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}