package systems.abacus.eurekastackaws

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EurekaStackAwsApplication

fun main(args: Array<String>) {
    runApplication<EurekaStackAwsApplication>(*args)
}

