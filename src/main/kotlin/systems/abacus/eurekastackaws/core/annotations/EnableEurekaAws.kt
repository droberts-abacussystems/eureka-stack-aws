package systems.abacus.eurekastackaws.core.annotations

import org.springframework.context.annotation.Import
import systems.abacus.eurekastackaws.core.config.EurekaAwsStackAutoConfiguration

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Import(EurekaAwsStackAutoConfiguration::class)
annotation class EnableEurekaAws {
}